import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class149 {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
	private int anInt3671 = 0;

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
	private int anInt3672 = 0;

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "Lclient!bl;")
	private Class30 aClass30_1 = null;

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "Lclient!mi;")
	private final Class155_Sub1 aClass155_Sub1_27;

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "Lclient!mb;")
	private final Class152 aClass152_3;

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "[Lclient!fo;")
	private final Class86[] aClass86Array1;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!mi;)V")
	public Class149(@OriginalArg(0) Class155_Sub1 arg0) {
		this.aClass155_Sub1_27 = arg0;
		this.aClass152_3 = new Class152(arg0);
		this.aClass86Array1 = new Class86[9];
		this.aClass86Array1[1] = new Class86_Sub6(arg0);
		this.aClass86Array1[2] = new Class86_Sub3(arg0, this.aClass152_3);
		this.aClass86Array1[4] = new Class86_Sub1(arg0, this.aClass152_3);
		this.aClass86Array1[5] = new Class86_Sub5(arg0, this.aClass152_3);
		this.aClass86Array1[6] = new Class86_Sub4(arg0);
		this.aClass86Array1[7] = new Class86_Sub7(arg0);
		this.aClass86Array1[3] = new Class86_Sub2(arg0);
		this.aClass86Array1[8] = this.aClass86Array1[4];
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZI)V")
	public void method3223(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (this.anInt3672 != 0 & (arg0 != this.anInt3671 | arg1)) {
			this.aClass86Array1[Integer.MAX_VALUE & this.anInt3672].method5359(arg0);
			this.anInt3671 = arg0;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BI)Z")
	public boolean method3224() {
		return this.aClass86Array1[3].method5358();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!bl;B)Z")
	public boolean method3225(@OriginalArg(0) Class30 arg0) {
		if (this.anInt3672 == 0) {
			return false;
		}
		if (arg0 != this.aClass30_1) {
			this.aClass86Array1[Integer.MAX_VALUE & this.anInt3672].method5357(arg0);
			this.aClass30_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZZI)V")
	public void method3226(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = arg0 & this.aClass155_Sub1_27.method4938();
		if (!local5 && (arg2 == 4 || arg2 == 8)) {
			arg2 = 2;
		}
		if (arg2 != 0 && arg1) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (this.anInt3672 != arg2) {
			if (this.anInt3672 != 0) {
				this.aClass86Array1[Integer.MAX_VALUE & this.anInt3672].method5361();
			}
			if (arg2 != 0) {
				this.aClass86Array1[Integer.MAX_VALUE & arg2].method5360(arg1);
				this.aClass86Array1[arg2 & Integer.MAX_VALUE].method5362(arg1);
			}
			this.anInt3671 = Integer.MIN_VALUE;
			this.anInt3672 = arg2;
			this.aClass30_1 = null;
		} else if (this.anInt3672 != 0) {
			this.aClass86Array1[Integer.MAX_VALUE & this.anInt3672].method5362(arg1);
		}
	}
}
