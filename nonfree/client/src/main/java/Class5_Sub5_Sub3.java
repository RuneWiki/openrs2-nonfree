import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class5_Sub5_Sub3 extends Class5_Sub5 {

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "F")
	private float aFloat108;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
	private int anInt5463;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
	private int anInt5464;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "Ljava/lang/String;")
	private String aString81;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "F")
	private float aFloat109;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "Ljava/lang/String;")
	private String aString82;

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "Ljava/lang/String;")
	private String aString83;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub5_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)Ljava/lang/String;")
	public String method4929() {
		return this.aString83;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)F")
	public float method4930() {
		return this.aFloat109;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	@Override
	public void method7384() {
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;Z)V")
	@Override
	protected void method7383(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt8564 > 0 && !"SUB".equals(this.aString81)) {
			return;
		}
		@Pc(18) Class5_Sub12 local18 = new Class5_Sub12(arg0.getData());
		@Pc(28) int local28 = local18.method8645();
		if (super.anInt8564 > 8) {
			if (local28 == 0) {
				@Pc(38) long local38 = local18.method8654();
				@Pc(42) long local42 = local18.method8654();
				@Pc(46) long local46 = local18.method8654();
				if (local38 < 0L || local42 < 0L || local46 < 0L || local38 < local46) {
					throw new IllegalStateException();
				}
				this.aFloat108 = (float) ((long) this.anInt5463 * local38) / (float) this.anInt5464;
				this.aFloat109 = (float) ((long) this.anInt5463 * (local42 + local38)) / (float) this.anInt5464;
				@Pc(104) int local104 = local18.method8624();
				if (local104 < 0 || local104 > local18.aByteArray104.length - local18.anInt10154) {
					throw new IllegalStateException();
				}
				this.aString83 = Static247.method3787(local18.aByteArray104, local104, local18.anInt10154);
			}
			if ((local28 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local28 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt8564 != 0) {
			return;
		}
		local18.anInt10154 += 23;
		this.anInt5464 = local18.method8624();
		this.anInt5463 = local18.method8624();
		if (this.anInt5464 == 0 || this.anInt5463 == 0) {
			throw new IllegalStateException();
		}
		@Pc(182) Class5_Sub12 local182 = new Class5_Sub12(16);
		local18.method8625(local182.aByteArray104, 0, 16);
		this.aString82 = local182.method8617();
		local182.anInt10154 = 0;
		local18.method8625(local182.aByteArray104, 0, 16);
		this.aString81 = local182.method8617();
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(B)F")
	public float method4932() {
		return this.aFloat108;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public String method4933() {
		return this.aString82;
	}
}
