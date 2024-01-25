import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class12_Sub4_Sub7 extends Class12_Sub4 {

	@OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
	public int anInt3090 = -1;

	@OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
	public int anInt3086 = -1;

	@OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
	public int anInt3089 = 0;

	@OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
	public int anInt3092 = 0;

	@OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
	public int anInt3091 = 12800;

	@OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
	public int anInt3097 = 12800;

	@OriginalMember(owner = "client!fi", name = "Q", descriptor = "Z")
	public boolean aBoolean248 = true;

	@OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
	public final int anInt3088;

	@OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
	public final int anInt3098;

	@OriginalMember(owner = "client!fi", name = "C", descriptor = "Ljava/lang/String;")
	public final String aString28;

	@OriginalMember(owner = "client!fi", name = "J", descriptor = "Ljava/lang/String;")
	public final String aString29;

	@OriginalMember(owner = "client!fi", name = "P", descriptor = "Lclient!dm;")
	public final Class73 aClass73_22;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class12_Sub4_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt3088 = arg0;
		this.anInt3090 = arg4;
		this.anInt3098 = arg3;
		this.aBoolean248 = arg5;
		this.aString28 = arg2;
		this.aString29 = arg1;
		this.anInt3086 = arg6;
		if (this.anInt3086 == 255) {
			this.anInt3086 = 0;
		}
		this.aClass73_22 = new Class73();
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(III)Z")
	public boolean method2805(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class12_Sub33 local11 = (Class12_Sub33) this.aClass73_22.method2005(); local11 != null; local11 = (Class12_Sub33) this.aClass73_22.method2009()) {
			if (local11.method4801(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([IIII)Z")
	public boolean method2806(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class12_Sub33 local11 = (Class12_Sub33) this.aClass73_22.method2005(); local11 != null; local11 = (Class12_Sub33) this.aClass73_22.method2009()) {
			if (local11.method4801(arg1, arg2)) {
				local11.method4799(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II[III)Z")
	public boolean method2807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(19) Class12_Sub33 local19 = (Class12_Sub33) this.aClass73_22.method2005(); local19 != null; local19 = (Class12_Sub33) this.aClass73_22.method2009()) {
			if (local19.method4796(arg1, arg0, arg3)) {
				local19.method4799(arg1, arg3, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(III[I)Z")
	public boolean method2808(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(17) Class12_Sub33 local17 = (Class12_Sub33) this.aClass73_22.method2005(); local17 != null; local17 = (Class12_Sub33) this.aClass73_22.method2009()) {
			if (local17.method4798(arg1, arg0)) {
				local17.method4797(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
	public void method2810() {
		this.anInt3089 = 0;
		this.anInt3097 = 12800;
		this.anInt3092 = 0;
		this.anInt3091 = 12800;
		for (@Pc(23) Class12_Sub33 local23 = (Class12_Sub33) this.aClass73_22.method2005(); local23 != null; local23 = (Class12_Sub33) this.aClass73_22.method2009()) {
			if (this.anInt3097 > local23.anInt5696) {
				this.anInt3097 = local23.anInt5696;
			}
			if (this.anInt3089 < local23.anInt5694) {
				this.anInt3089 = local23.anInt5694;
			}
			if (local23.anInt5690 > this.anInt3092) {
				this.anInt3092 = local23.anInt5690;
			}
			if (this.anInt3091 > local23.anInt5703) {
				this.anInt3091 = local23.anInt5703;
			}
		}
	}
}
