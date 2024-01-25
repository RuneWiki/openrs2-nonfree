import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class Class3_Sub4_Sub3 extends Class3_Sub4 {

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
	public int anInt1158;

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
	public int anInt1159;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
	public int anInt1160;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
	public int anInt1162;

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
	public int anInt1164;

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "Lclient!vea;")
	public final Class353 aClass353_1;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "Lclient!hl;")
	public final Class142 aClass142_1;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!vea;Lclient!ta;)V")
	public Class3_Sub4_Sub3(@OriginalArg(0) Class353 arg0, @OriginalArg(1) Class4_Sub10 arg1) {
		this.aClass353_1 = arg0;
		this.aClass142_1 = this.aClass353_1.method8351();
		this.method1252();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public void method1252() {
		this.anInt1160 = this.aClass353_1.anInt9742;
		this.anInt1164 = this.aClass353_1.anInt9747;
		this.anInt1162 = this.aClass353_1.anInt9744;
		if (this.aClass353_1.aClass39_13 != null) {
			this.aClass353_1.aClass39_13.method7243(this.aClass142_1.anInt4117, this.aClass142_1.anInt4113, this.aClass142_1.anInt4120, Static471.anIntArray524);
		}
		this.anInt1159 = Static471.anIntArray524[0];
		this.anInt1158 = Static471.anIntArray524[2];
	}
}
