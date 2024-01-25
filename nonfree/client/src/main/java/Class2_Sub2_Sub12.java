import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public final class Class2_Sub2_Sub12 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
	public int anInt5541;

	@OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
	public int anInt5542;

	@OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
	public int anInt5545;

	@OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
	public int anInt5546;

	@OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
	public int anInt5547;

	@OriginalMember(owner = "client!ml", name = "u", descriptor = "Lclient!il;")
	public final Class163 aClass163_2;

	@OriginalMember(owner = "client!ml", name = "C", descriptor = "Lclient!kq;")
	public final Class198 aClass198_1;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!il;Lclient!kv;)V")
	public Class2_Sub2_Sub12(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class12_Sub4 arg1) {
		this.aClass163_2 = arg0;
		this.aClass198_1 = this.aClass163_2.method3310();
		this.method4775();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
	public void method4775() {
		this.anInt5547 = this.aClass163_2.anInt3824;
		this.anInt5541 = this.aClass163_2.anInt3823;
		this.anInt5546 = this.aClass163_2.anInt3825;
		if (this.aClass163_2.aClass25_1 != null) {
			this.aClass163_2.aClass25_1.wa(this.aClass198_1.anInt4876, this.aClass198_1.anInt4879, this.aClass198_1.anInt4868, Static219.anIntArray265);
		}
		this.anInt5542 = Static219.anIntArray265[0];
		this.anInt5545 = Static219.anIntArray265[2];
	}
}
