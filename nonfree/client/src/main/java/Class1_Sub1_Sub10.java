import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
	public int anInt3976;

	@OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
	public int anInt3977;

	@OriginalMember(owner = "client!hq", name = "u", descriptor = "I")
	public int anInt3979;

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "I")
	public int anInt3980;

	@OriginalMember(owner = "client!hq", name = "z", descriptor = "I")
	public int anInt3982;

	@OriginalMember(owner = "client!hq", name = "y", descriptor = "Lclient!ia;")
	public final Class129 aClass129_1;

	@OriginalMember(owner = "client!hq", name = "t", descriptor = "Lclient!vda;")
	public final Class302 aClass302_1;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!ia;Lclient!dea;)V")
	public Class1_Sub1_Sub10(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class2_Sub3 arg1) {
		this.aClass129_1 = arg0;
		this.aClass302_1 = this.aClass129_1.method3626();
		this.method3536();
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(Z)V")
	public void method3536() {
		this.anInt3982 = this.aClass129_1.anInt4064;
		this.anInt3976 = this.aClass129_1.anInt4068;
		this.anInt3979 = this.aClass129_1.anInt4063;
		if (this.aClass129_1.aClass22_7 != null) {
			this.aClass129_1.aClass22_7.I(this.aClass302_1.anInt8613, this.aClass302_1.anInt8616, this.aClass302_1.anInt8610, Static363.anIntArray639);
		}
		this.anInt3980 = Static363.anIntArray639[0];
		this.anInt3977 = Static363.anIntArray639[2];
	}
}
