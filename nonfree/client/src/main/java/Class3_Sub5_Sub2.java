import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class3_Sub5_Sub2 extends Class3_Sub5 {

	@OriginalMember(owner = "client!dfa", name = "r", descriptor = "Ljava/lang/String;")
	private String aString24;

	@OriginalMember(owner = "client!dfa", name = "y", descriptor = "F")
	private float aFloat71;

	@OriginalMember(owner = "client!dfa", name = "z", descriptor = "I")
	private int anInt2159;

	@OriginalMember(owner = "client!dfa", name = "D", descriptor = "F")
	private float aFloat72;

	@OriginalMember(owner = "client!dfa", name = "F", descriptor = "Ljava/lang/String;")
	private String aString25;

	@OriginalMember(owner = "client!dfa", name = "G", descriptor = "Ljava/lang/String;")
	private String aString26;

	@OriginalMember(owner = "client!dfa", name = "K", descriptor = "I")
	private int anInt2165;

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub5_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "(I)F")
	public float method2011() {
		return this.aFloat71;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)V")
	@Override
	public void method7531() {
	}

	@OriginalMember(owner = "client!dfa", name = "c", descriptor = "(I)Ljava/lang/String;")
	public String method2013() {
		return this.aString26;
	}

	@OriginalMember(owner = "client!dfa", name = "f", descriptor = "(I)F")
	public float method2015() {
		return this.aFloat72;
	}

	@OriginalMember(owner = "client!dfa", name = "c", descriptor = "(B)Ljava/lang/String;")
	public String method2017() {
		return this.aString25;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method7526(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt8862 > 0 && !"SUB".equals(this.aString24)) {
			return;
		}
		@Pc(22) Class3_Sub17 local22 = new Class3_Sub17(arg0.getData());
		@Pc(26) int local26 = local22.method4888();
		if (super.anInt8862 > 8) {
			if (local26 == 0) {
				@Pc(109) long local109 = local22.method4842();
				@Pc(113) long local113 = local22.method4842();
				@Pc(117) long local117 = local22.method4842();
				if (local109 < 0L || local113 < 0L || local117 < 0L || local109 < local117) {
					throw new IllegalStateException();
				}
				this.aFloat72 = (float) ((long) this.anInt2159 * (local109 + local113)) / (float) this.anInt2165;
				this.aFloat71 = (float) ((long) this.anInt2159 * local109) / (float) this.anInt2165;
				@Pc(173) int local173 = local22.method4852();
				if (local173 < 0 || local22.aByteArray59.length - local22.lb < local173) {
					throw new IllegalStateException();
				}
				this.aString25 = Static338.method5150(local22.lb, local22.aByteArray59, local173);
			}
			if ((local26 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local26 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt8862 != 0) {
			return;
		}
		local22.lb += 23;
		this.anInt2165 = local22.method4852();
		this.anInt2159 = local22.method4852();
		if (this.anInt2165 != 0 && this.anInt2159 != 0) {
			@Pc(72) Class3_Sub17 local72 = new Class3_Sub17(16);
			local22.method4832(local72.aByteArray59, 0, 16);
			this.aString26 = local72.method4847();
			local72.lb = 0;
			local22.method4832(local72.aByteArray59, 0, 16);
			this.aString24 = local72.method4847();
			return;
		}
		throw new IllegalStateException();
	}
}
