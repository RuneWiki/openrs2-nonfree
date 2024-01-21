import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public final class Class6_Sub4_Sub1 extends Class6_Sub4 {

	@OriginalMember(owner = "client!da", name = "A", descriptor = "Z")
	public boolean aBoolean40;

	@OriginalMember(owner = "client!da", name = "E", descriptor = "I")
	public int anInt912;

	@OriginalMember(owner = "client!da", name = "C", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!da", name = "D", descriptor = "I")
	public int anInt911;

	@OriginalMember(owner = "client!da", name = "z", descriptor = "I")
	public int anInt910;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(I[BII)V")
	public Class6_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt912 = arg0;
		this.aByteArray5 = arg1;
		this.anInt911 = arg2;
		this.anInt910 = arg3;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!cc;)Lclient!da;")
	public Class6_Sub4_Sub1 method565(@OriginalArg(0) Class10 arg0) {
		this.aByteArray5 = arg0.method454(this.aByteArray5);
		this.anInt912 = arg0.method450(this.anInt912);
		if (this.anInt911 == this.anInt910) {
			this.anInt911 = this.anInt910 = arg0.method455(this.anInt911);
		} else {
			this.anInt911 = arg0.method455(this.anInt911);
			this.anInt910 = arg0.method455(this.anInt910);
			if (this.anInt911 == this.anInt910) {
				this.anInt911--;
			}
		}
		return this;
	}
}
