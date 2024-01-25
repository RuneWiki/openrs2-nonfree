import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public final class Class1_Sub32_Sub1 extends Class1_Sub32 {

	@OriginalMember(owner = "client!qk", name = "k", descriptor = "Z")
	public boolean aBoolean459;

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
	public int anInt6859;

	@OriginalMember(owner = "client!qk", name = "m", descriptor = "[B")
	public byte[] aByteArray81;

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
	public int anInt6858;

	@OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
	public int anInt6860;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub32_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6859 = arg0;
		this.aByteArray81 = arg1;
		this.anInt6858 = arg2;
		this.anInt6860 = arg3;
	}

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub32_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6859 = arg0;
		this.aByteArray81 = arg1;
		this.anInt6858 = arg2;
		this.anInt6860 = arg3;
		this.aBoolean459 = arg4;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!cc;)Lclient!qk;")
	public Class1_Sub32_Sub1 method5929(@OriginalArg(0) Class42 arg0) {
		this.aByteArray81 = arg0.method1503(this.aByteArray81);
		this.anInt6859 = arg0.method1506(this.anInt6859);
		if (this.anInt6858 == this.anInt6860) {
			this.anInt6858 = this.anInt6860 = arg0.method1505(this.anInt6858);
		} else {
			this.anInt6858 = arg0.method1505(this.anInt6858);
			this.anInt6860 = arg0.method1505(this.anInt6860);
			if (this.anInt6858 == this.anInt6860) {
				this.anInt6858--;
			}
		}
		return this;
	}
}
