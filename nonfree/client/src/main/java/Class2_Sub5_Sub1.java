import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public final class Class2_Sub5_Sub1 extends Class2_Sub5 {

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "Z")
	public boolean aBoolean43;

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
	public int anInt1045;

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
	public int anInt1044;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
	public int anInt1043;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1045 = arg0;
		this.aByteArray18 = arg1;
		this.anInt1044 = arg2;
		this.anInt1043 = arg3;
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1045 = arg0;
		this.aByteArray18 = arg1;
		this.anInt1044 = arg2;
		this.anInt1043 = arg3;
		this.aBoolean43 = arg4;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!pc;)Lclient!hb;")
	public Class2_Sub5_Sub1 method737(@OriginalArg(0) Class64 arg0) {
		this.aByteArray18 = arg0.method1446(this.aByteArray18);
		this.anInt1045 = arg0.method1445(this.anInt1045);
		if (this.anInt1044 == this.anInt1043) {
			this.anInt1044 = this.anInt1043 = arg0.method1442(this.anInt1044);
		} else {
			this.anInt1044 = arg0.method1442(this.anInt1044);
			this.anInt1043 = arg0.method1442(this.anInt1043);
			if (this.anInt1044 == this.anInt1043) {
				this.anInt1044--;
			}
		}
		return this;
	}
}
