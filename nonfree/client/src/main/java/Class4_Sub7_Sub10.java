import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public final class Class4_Sub7_Sub10 extends Class4_Sub7 {

	@OriginalMember(owner = "client!kp", name = "y", descriptor = "I")
	public int anInt5232;

	@OriginalMember(owner = "client!kp", name = "B", descriptor = "I")
	public int anInt5235;

	@OriginalMember(owner = "client!kp", name = "D", descriptor = "I")
	public int anInt5237;

	@OriginalMember(owner = "client!kp", name = "E", descriptor = "I")
	public int anInt5238;

	@OriginalMember(owner = "client!kp", name = "G", descriptor = "I")
	public int anInt5239;

	@OriginalMember(owner = "client!kp", name = "v", descriptor = "Lclient!efa;")
	public final Class89 aClass89_2;

	@OriginalMember(owner = "client!kp", name = "x", descriptor = "Lclient!iv;")
	public final Class167 aClass167_1;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!efa;Lclient!hv;)V")
	public Class4_Sub7_Sub10(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class26_Sub3 arg1) {
		this.aClass89_2 = arg0;
		this.aClass167_1 = this.aClass89_2.method2424();
		this.method4430();
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
	public void method4430() {
		this.anInt5239 = this.aClass89_2.anInt2741;
		this.anInt5232 = this.aClass89_2.anInt2744;
		this.anInt5235 = this.aClass89_2.anInt2748;
		if (this.aClass89_2.aClass134_3 != null) {
			this.aClass89_2.aClass134_3.R(this.aClass167_1.anInt4722, this.aClass167_1.anInt4725, this.aClass167_1.anInt4724, Static534.anIntArray685);
		}
		this.anInt5237 = Static534.anIntArray685[0];
		this.anInt5238 = Static534.anIntArray685[2];
	}
}
