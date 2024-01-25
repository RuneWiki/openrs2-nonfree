import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public final class Class1_Sub5_Sub13 extends Class1_Sub5 {

	@OriginalMember(owner = "client!mv", name = "t", descriptor = "I")
	public int anInt4679;

	@OriginalMember(owner = "client!mv", name = "x", descriptor = "I")
	public int anInt4681;

	@OriginalMember(owner = "client!mv", name = "z", descriptor = "I")
	public int anInt4683;

	@OriginalMember(owner = "client!mv", name = "B", descriptor = "I")
	public int anInt4684;

	@OriginalMember(owner = "client!mv", name = "C", descriptor = "I")
	public int anInt4685;

	@OriginalMember(owner = "client!mv", name = "v", descriptor = "Lclient!op;")
	public final Class181 aClass181_1;

	@OriginalMember(owner = "client!mv", name = "w", descriptor = "Lclient!kv;")
	public final Class139 aClass139_1;

	static {
		new Class119(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!op;Lclient!dl;)V")
	public Class1_Sub5_Sub13(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class4_Sub2 arg1) {
		this.aClass181_1 = arg0;
		this.aClass139_1 = this.aClass181_1.method4028();
		this.method3689();
	}

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "(Z)V")
	public void method3689() {
		this.anInt4685 = this.aClass181_1.anInt5141;
		this.anInt4684 = this.aClass181_1.anInt5144;
		this.anInt4683 = this.aClass181_1.anInt5136;
		if (this.aClass181_1.aClass32_8 != null) {
			this.aClass181_1.aClass32_8.K(this.aClass139_1.anInt3995, this.aClass139_1.anInt3983, this.aClass139_1.anInt3979, Static1.anIntArray1);
		}
		this.anInt4679 = Static1.anIntArray1[2];
		this.anInt4681 = Static1.anIntArray1[0];
	}
}
