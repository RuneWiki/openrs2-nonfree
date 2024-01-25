import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public final class Class3_Sub1_Sub15 extends Class3_Sub1 {

	@OriginalMember(owner = "client!nca", name = "s", descriptor = "I")
	public int anInt7007;

	@OriginalMember(owner = "client!nca", name = "w", descriptor = "I")
	public int anInt7009;

	@OriginalMember(owner = "client!nca", name = "z", descriptor = "I")
	public int anInt7011;

	@OriginalMember(owner = "client!nca", name = "B", descriptor = "I")
	public int anInt7013;

	@OriginalMember(owner = "client!nca", name = "F", descriptor = "I")
	public int anInt7015;

	@OriginalMember(owner = "client!nca", name = "y", descriptor = "Lclient!mi;")
	public final Class215 aClass215_2;

	@OriginalMember(owner = "client!nca", name = "v", descriptor = "Lclient!bt;")
	public final Class37 aClass37_1;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Lclient!mi;Lclient!aj;)V")
	public Class3_Sub1_Sub15(@OriginalArg(0) Class215 arg0, @OriginalArg(1) Class2_Sub2 arg1) {
		this.aClass215_2 = arg0;
		this.aClass37_1 = this.aClass215_2.method5690();
		this.method5882();
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(B)V")
	public void method5882() {
		this.anInt7009 = this.aClass215_2.anInt6806;
		this.anInt7015 = this.aClass215_2.anInt6810;
		this.anInt7011 = this.aClass215_2.anInt6804;
		if (this.aClass215_2.aClass47_3 != null) {
			this.aClass215_2.aClass47_3.method7862(this.aClass37_1.anInt1087, this.aClass37_1.anInt1088, this.aClass37_1.anInt1090, Static611.anIntArray614);
		}
		this.anInt7007 = Static611.anIntArray614[0];
		this.anInt7013 = Static611.anIntArray614[2];
	}
}
