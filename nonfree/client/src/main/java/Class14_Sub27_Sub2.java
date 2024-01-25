import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class14_Sub27_Sub2 extends Class14_Sub27 {

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "[I")
	public static final int[] anIntArray430 = new int[4096];

	@OriginalMember(owner = "client!kk", name = "t", descriptor = "Ljava/lang/String;")
	private String aString59;

	@OriginalMember(owner = "client!kk", name = "y", descriptor = "F")
	private float aFloat108;

	@OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
	private int anInt5347;

	@OriginalMember(owner = "client!kk", name = "D", descriptor = "Ljava/lang/String;")
	private String aString60;

	@OriginalMember(owner = "client!kk", name = "H", descriptor = "Ljava/lang/String;")
	private String aString61;

	@OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
	private int anInt5355;

	@OriginalMember(owner = "client!kk", name = "K", descriptor = "F")
	private float aFloat109;

	static {
		for (@Pc(6) int local6 = 0; local6 < 4096; local6++) {
			anIntArray430[local6] = Static42.method928(local6);
		}
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class14_Sub27_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(B)F")
	public float method4481() {
		return this.aFloat109;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)F")
	public float method4485() {
		return this.aFloat108;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
	@Override
	public void method9051() {
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method9050(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt10860 > 0 && !"SUB".equals(this.aString59)) {
			return;
		}
		@Pc(29) Class14_Sub29 local29 = new Class14_Sub29(arg0.getData());
		@Pc(33) int local33 = local29.method5866();
		if (super.anInt10860 > 8) {
			if (local33 == 0) {
				@Pc(43) long local43 = local29.method5885();
				@Pc(47) long local47 = local29.method5885();
				@Pc(51) long local51 = local29.method5885();
				if (local43 < 0L || local47 < 0L || local51 < 0L || local51 > local43) {
					throw new IllegalStateException();
				}
				this.aFloat109 = (float) (local43 * (long) this.anInt5355) / (float) this.anInt5347;
				this.aFloat108 = (float) ((long) this.anInt5355 * (local43 + local47)) / (float) this.anInt5347;
				@Pc(108) int local108 = local29.method5882();
				if (local108 < 0 || local108 > local29.aByteArray84.length - local29.anInt7264) {
					throw new IllegalStateException();
				}
				this.aString60 = Static626.method8799(local108, local29.aByteArray84, local29.anInt7264);
			}
			if ((local33 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local33 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt10860 != 0) {
			return;
		}
		local29.anInt7264 += 23;
		this.anInt5347 = local29.method5882();
		this.anInt5355 = local29.method5882();
		if (this.anInt5347 == 0 || this.anInt5355 == 0) {
			throw new IllegalStateException();
		}
		@Pc(191) Class14_Sub29 local191 = new Class14_Sub29(16);
		local29.method5860(local191.aByteArray84, 0, 16);
		this.aString61 = local191.method5898();
		local191.anInt7264 = 0;
		local29.method5860(local191.aByteArray84, 0, 16);
		this.aString59 = local191.method5898();
	}

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "(B)Ljava/lang/String;")
	public String method4488() {
		return this.aString60;
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)Ljava/lang/String;")
	public String method4489() {
		return this.aString61;
	}
}
