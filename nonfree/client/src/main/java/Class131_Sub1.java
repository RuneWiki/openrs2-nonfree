import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public final class Class131_Sub1 extends Class131 implements Interface3 {

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
	private int anInt3189;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
	private int anInt3190;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!qi;I[BI)V")
	public Class131_Sub1(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt3189 = arg1;
		this.anInt3190 = this.aClass82_Sub2_36.method4578(this.anInt3189);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
	@Override
	public void method3547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass82_Sub2_36.anOpengl2.glDrawElements(4, arg1, this.anInt3189, this.aByteBuffer6.position(arg0 * this.anInt3190));
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method3548(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5128(arg0, arg1);
		this.anInt3189 = 5123;
		this.anInt3190 = this.aClass82_Sub2_36.method4578(this.anInt3189);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "()I")
	@Override
	public int method5130() {
		return 0;
	}
}
