import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class3_Sub9_Sub1 extends Class3_Sub9 {

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "Z")
	public boolean aBoolean33;

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
	public int anInt1103;

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
	public int anInt1104;

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
	public int anInt1102;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1103 = arg0;
		this.aByteArray32 = arg1;
		this.anInt1104 = arg2;
		this.anInt1102 = arg3;
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1103 = arg0;
		this.aByteArray32 = arg1;
		this.anInt1104 = arg2;
		this.anInt1102 = arg3;
		this.aBoolean33 = arg4;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!pf;)Lclient!fc;")
	public Class3_Sub9_Sub1 method728(@OriginalArg(0) Class56 arg0) {
		this.aByteArray32 = arg0.method1709(this.aByteArray32);
		this.anInt1103 = arg0.method1707(this.anInt1103);
		if (this.anInt1104 == this.anInt1102) {
			this.anInt1104 = this.anInt1102 = arg0.method1708(this.anInt1104);
		} else {
			this.anInt1104 = arg0.method1708(this.anInt1104);
			this.anInt1102 = arg0.method1708(this.anInt1102);
			if (this.anInt1104 == this.anInt1102) {
				this.anInt1104--;
			}
		}
		return this;
	}
}
