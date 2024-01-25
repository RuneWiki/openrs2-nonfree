import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class294 {

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
	private int anInt7903 = 0;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
	private int anInt7905 = 0;

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
	private int anInt7907 = 0;

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "Lclient!uja;")
	private final Class145_Sub3 aClass145_Sub3_31;

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "Lclient!qf;")
	private final Class308 aClass308_2;

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "[Lclient!tla;")
	private final Class112[] aClass112Array1;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "Lclient!ju;")
	public final Class112_Sub4 aClass112_Sub4_1;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!uja;)V")
	public Class294(@OriginalArg(0) Class145_Sub3 arg0) {
		this.aClass145_Sub3_31 = arg0;
		this.aClass308_2 = new Class308(arg0);
		this.aClass112Array1 = new Class112[10];
		this.aClass112Array1[1] = new Class112_Sub3(arg0);
		this.aClass112Array1[2] = new Class112_Sub2(arg0, this.aClass308_2);
		this.aClass112Array1[4] = new Class112_Sub5(arg0, this.aClass308_2);
		this.aClass112Array1[5] = new Class112_Sub8(arg0, this.aClass308_2);
		this.aClass112Array1[6] = new Class112_Sub6(arg0);
		this.aClass112Array1[7] = new Class112_Sub1(arg0);
		this.aClass112Array1[3] = this.aClass112_Sub4_1 = new Class112_Sub4(arg0);
		this.aClass112Array1[8] = new Class112_Sub9(arg0, this.aClass308_2);
		this.aClass112Array1[9] = new Class112_Sub7(arg0, this.aClass308_2);
		if (!this.aClass112Array1[8].method8389()) {
			this.aClass112Array1[8] = this.aClass112Array1[4];
		}
		if (!this.aClass112Array1[9].method8389()) {
			this.aClass112Array1[9] = this.aClass112Array1[8];
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBLclient!jca;)Z")
	public boolean method7048(@OriginalArg(0) int arg0, @OriginalArg(2) Class64 arg1) {
		if (this.anInt7905 == 0) {
			return false;
		} else {
			this.aClass112Array1[Integer.MAX_VALUE & this.anInt7905].method8397(arg1, arg0);
			return true;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZIZZI)V")
	public void method7049(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(5) boolean local5 = arg3 & this.aClass145_Sub3_31.method9710();
		if (!local5 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			if (arg4 == 4) {
				arg2 = arg0;
			}
			arg4 = 2;
		}
		if (arg4 != 0 && arg1) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (this.anInt7905 != arg4) {
			if (this.anInt7905 != 0) {
				this.aClass112Array1[Integer.MAX_VALUE & this.anInt7905].method8390();
			}
			if (arg4 != 0) {
				this.aClass112Array1[Integer.MAX_VALUE & arg4].method8396(arg1);
				this.aClass112Array1[Integer.MAX_VALUE & arg4].method8388(arg1);
				this.aClass112Array1[Integer.MAX_VALUE & arg4].method8393(arg2, arg0);
			}
			this.anInt7903 = arg0;
			this.anInt7905 = arg4;
			this.anInt7907 = arg2;
		} else if (this.anInt7905 != 0) {
			this.aClass112Array1[this.anInt7905 & Integer.MAX_VALUE].method8388(arg1);
			if (arg0 != this.anInt7903 || arg2 != this.anInt7907) {
				this.aClass112Array1[Integer.MAX_VALUE & this.anInt7905].method8393(arg2, arg0);
				this.anInt7907 = arg2;
				this.anInt7903 = arg0;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BI)Z")
	public boolean method7050() {
		return this.aClass112Array1[3].method8389();
	}
}
