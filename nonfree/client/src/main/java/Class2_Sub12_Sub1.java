import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public final class Class2_Sub12_Sub1 extends Class2_Sub12 {

	@OriginalMember(owner = "client!vo", name = "t", descriptor = "Z")
	public boolean aBoolean592;

	@OriginalMember(owner = "client!vo", name = "s", descriptor = "I")
	public int anInt6730;

	@OriginalMember(owner = "client!vo", name = "r", descriptor = "[B")
	public byte[] aByteArray90;

	@OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
	public int anInt6729;

	@OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
	public int anInt6731;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6730 = arg0;
		this.aByteArray90 = arg1;
		this.anInt6729 = arg2;
		this.anInt6731 = arg3;
	}

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6730 = arg0;
		this.aByteArray90 = arg1;
		this.anInt6729 = arg2;
		this.anInt6731 = arg3;
		this.aBoolean592 = arg4;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!dp;)Lclient!vo;")
	public Class2_Sub12_Sub1 method5838(@OriginalArg(0) Class46 arg0) {
		this.aByteArray90 = arg0.method1387(this.aByteArray90);
		this.anInt6730 = arg0.method1385(this.anInt6730);
		if (this.anInt6729 == this.anInt6731) {
			this.anInt6729 = this.anInt6731 = arg0.method1391(this.anInt6729);
		} else {
			this.anInt6729 = arg0.method1391(this.anInt6729);
			this.anInt6731 = arg0.method1391(this.anInt6731);
			if (this.anInt6729 == this.anInt6731) {
				this.anInt6729--;
			}
		}
		return this;
	}
}
