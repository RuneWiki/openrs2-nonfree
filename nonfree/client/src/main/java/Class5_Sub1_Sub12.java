import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public final class Class5_Sub1_Sub12 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ls", name = "y", descriptor = "I")
	public int anInt3737;

	@OriginalMember(owner = "client!ls", name = "z", descriptor = "I")
	public int anInt3738;

	@OriginalMember(owner = "client!ls", name = "A", descriptor = "I")
	public int anInt3739;

	@OriginalMember(owner = "client!ls", name = "C", descriptor = "I")
	public int anInt3741;

	@OriginalMember(owner = "client!ls", name = "H", descriptor = "I")
	public int anInt3743;

	@OriginalMember(owner = "client!ls", name = "D", descriptor = "Lclient!od;")
	public final Class148 aClass148_1;

	@OriginalMember(owner = "client!ls", name = "J", descriptor = "Lclient!w;")
	public final Class209 aClass209_1;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!od;Lclient!rs;)V")
	public Class5_Sub1_Sub12(@OriginalArg(0) Class148 arg0, @OriginalArg(1) Class32_Sub7 arg1) {
		this.aClass148_1 = arg0;
		this.aClass209_1 = Static19.method356(arg0.anInt4440);
		this.method3380();
	}

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "(I)V")
	public void method3380() {
		this.anInt3743 = this.aClass148_1.anInt4442;
		this.anInt3741 = this.aClass148_1.anInt4441;
		this.anInt3738 = this.aClass148_1.anInt4439;
		if (this.aClass148_1.aClass66_3 != null) {
			this.aClass148_1.aClass66_3.method5816(this.aClass209_1.anInt6627, this.aClass209_1.anInt6613, this.aClass209_1.anInt6628, Static111.anIntArray206);
		}
		this.anInt3737 = Static111.anIntArray206[2];
		this.anInt3739 = Static111.anIntArray206[0];
	}
}
