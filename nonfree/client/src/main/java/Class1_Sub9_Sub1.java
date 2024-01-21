import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public final class Class1_Sub9_Sub1 extends Class1_Sub9 {

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "Z")
	public boolean aBoolean121;

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
	public int anInt3155;

	@OriginalMember(owner = "client!vb", name = "B", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
	public int anInt3157;

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
	public int anInt3156;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3155 = arg0;
		this.aByteArray39 = arg1;
		this.anInt3157 = arg2;
		this.anInt3156 = arg3;
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3155 = arg0;
		this.aByteArray39 = arg1;
		this.anInt3157 = arg2;
		this.anInt3156 = arg3;
		this.aBoolean121 = arg4;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!ae;)Lclient!vb;")
	public Class1_Sub9_Sub1 method2191(@OriginalArg(0) Class4 arg0) {
		this.aByteArray39 = arg0.method180(this.aByteArray39);
		this.anInt3155 = arg0.method179(this.anInt3155);
		if (this.anInt3157 == this.anInt3156) {
			this.anInt3157 = this.anInt3156 = arg0.method177(this.anInt3157);
		} else {
			this.anInt3157 = arg0.method177(this.anInt3157);
			this.anInt3156 = arg0.method177(this.anInt3156);
			if (this.anInt3157 == this.anInt3156) {
				this.anInt3157--;
			}
		}
		return this;
	}
}
