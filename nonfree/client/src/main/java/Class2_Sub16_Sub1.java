import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class2_Sub16_Sub1 extends Class2_Sub16 {

	@OriginalMember(owner = "client!qe", name = "t", descriptor = "Z")
	public boolean aBoolean180;

	@OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
	public int anInt2504;

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
	public int anInt2505;

	@OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
	public int anInt2506;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub16_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2504 = arg0;
		this.aByteArray35 = arg1;
		this.anInt2505 = arg2;
		this.anInt2506 = arg3;
	}

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub16_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2504 = arg0;
		this.aByteArray35 = arg1;
		this.anInt2505 = arg2;
		this.anInt2506 = arg3;
		this.aBoolean180 = arg4;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ec;)Lclient!qe;")
	public Class2_Sub16_Sub1 method1509(@OriginalArg(0) Class18 arg0) {
		this.aByteArray35 = arg0.method581(this.aByteArray35);
		this.anInt2504 = arg0.method579(this.anInt2504);
		if (this.anInt2505 == this.anInt2506) {
			this.anInt2505 = this.anInt2506 = arg0.method573(this.anInt2505);
		} else {
			this.anInt2505 = arg0.method573(this.anInt2505);
			this.anInt2506 = arg0.method573(this.anInt2506);
			if (this.anInt2505 == this.anInt2506) {
				this.anInt2505--;
			}
		}
		return this;
	}
}
