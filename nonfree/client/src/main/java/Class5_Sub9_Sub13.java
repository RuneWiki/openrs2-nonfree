import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class5_Sub9_Sub13 extends Class5_Sub9 {

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
	public int anInt3135;

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
	public int anInt3136;

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
	public int anInt3138;

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
	public int anInt3139;

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
	public int anInt3140;

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "Lclient!or;")
	public final Class151 aClass151_1;

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "Lclient!qa;")
	public final Class163 aClass163_1;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!or;Lclient!pl;)V")
	public Class5_Sub9_Sub13(@OriginalArg(0) Class151 arg0, @OriginalArg(1) Class63_Sub5 arg1) {
		this.aClass151_1 = arg0;
		this.aClass163_1 = Static316.method5377(arg0.anInt4541);
		this.method2922();
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)V")
	public void method2922() {
		this.anInt3139 = this.aClass151_1.anInt4542;
		this.anInt3136 = this.aClass151_1.anInt4545;
		this.anInt3135 = this.aClass151_1.anInt4540;
		if (this.aClass151_1.aClass112_3 != null) {
			this.aClass151_1.aClass112_3.method3592(this.aClass163_1.anInt4859, this.aClass163_1.anInt4852, this.aClass163_1.anInt4857, Static206.anIntArray293);
		}
		this.anInt3140 = Static206.anIntArray293[2];
		this.anInt3138 = Static206.anIntArray293[0];
	}
}
