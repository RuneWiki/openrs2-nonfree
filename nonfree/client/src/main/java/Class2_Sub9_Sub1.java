import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public final class Class2_Sub9_Sub1 extends Class2_Sub9 {

	@OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
	public int anInt1216;

	@OriginalMember(owner = "client!ga", name = "E", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
	public int anInt1217;

	@OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
	public int anInt1218;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1216 = arg0;
		this.aByteArray12 = arg1;
		this.anInt1217 = arg2;
		this.anInt1218 = arg3;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!p;)Lclient!ga;")
	public Class2_Sub9_Sub1 method823(@OriginalArg(0) Class44 arg0) {
		this.aByteArray12 = arg0.method1417(this.aByteArray12);
		this.anInt1216 = arg0.method1413(this.anInt1216);
		if (this.anInt1217 == this.anInt1218) {
			this.anInt1217 = this.anInt1218 = arg0.method1415(this.anInt1217);
		} else {
			this.anInt1217 = arg0.method1415(this.anInt1217);
			this.anInt1218 = arg0.method1415(this.anInt1218);
			if (this.anInt1217 == this.anInt1218) {
				this.anInt1217--;
			}
		}
		return this;
	}
}
