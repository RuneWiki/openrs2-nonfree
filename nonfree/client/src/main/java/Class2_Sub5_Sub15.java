import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class2_Sub5_Sub15 extends Class2_Sub5 {

	@OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
	public int anInt5821 = 0;

	@OriginalMember(owner = "client!rg", name = "y", descriptor = "Z")
	public boolean aBoolean424 = true;

	@OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
	public int anInt5822 = -1;

	@OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
	public int anInt5825 = -1;

	@OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
	public int anInt5826 = 12800;

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
	public int anInt5815 = 12800;

	@OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
	public int anInt5829 = 0;

	@OriginalMember(owner = "client!rg", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString163;

	@OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
	public final int anInt5827;

	@OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
	public final int anInt5823;

	@OriginalMember(owner = "client!rg", name = "v", descriptor = "Ljava/lang/String;")
	public final String aString162;

	@OriginalMember(owner = "client!rg", name = "r", descriptor = "Lclient!mg;")
	public final Class156 aClass156_51;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class2_Sub5_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt5822 = arg4;
		this.aString163 = arg1;
		this.anInt5827 = arg3;
		this.anInt5823 = arg0;
		this.aString162 = arg2;
		this.aBoolean424 = arg5;
		this.anInt5825 = arg6;
		if (this.anInt5825 == 255) {
			this.anInt5825 = 0;
		}
		this.aClass156_51 = new Class156();
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V")
	public void method4570() {
		this.anInt5821 = 0;
		this.anInt5815 = 12800;
		this.anInt5826 = 12800;
		this.anInt5829 = 0;
		for (@Pc(23) Class2_Sub38 local23 = (Class2_Sub38) this.aClass156_51.method3155(); local23 != null; local23 = (Class2_Sub38) this.aClass156_51.method3150()) {
			if (this.anInt5815 > local23.anInt5842) {
				this.anInt5815 = local23.anInt5842;
			}
			if (local23.anInt5844 > this.anInt5821) {
				this.anInt5821 = local23.anInt5844;
			}
			if (this.anInt5826 > local23.anInt5838) {
				this.anInt5826 = local23.anInt5838;
			}
			if (local23.anInt5839 > this.anInt5829) {
				this.anInt5829 = local23.anInt5839;
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[III)Z")
	public boolean method4571(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class2_Sub38 local11 = (Class2_Sub38) this.aClass156_51.method3155(); local11 != null; local11 = (Class2_Sub38) this.aClass156_51.method3150()) {
			if (local11.method4582(arg0, arg2)) {
				local11.method4579(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)Z")
	public boolean method4572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(17) Class2_Sub38 local17 = (Class2_Sub38) this.aClass156_51.method3155(); local17 != null; local17 = (Class2_Sub38) this.aClass156_51.method3150()) {
			if (local17.method4581(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[IBI)Z")
	public boolean method4573(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(16) Class2_Sub38 local16 = (Class2_Sub38) this.aClass156_51.method3155(); local16 != null; local16 = (Class2_Sub38) this.aClass156_51.method3150()) {
			if (local16.method4581(arg0, arg2)) {
				local16.method4580(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII[I)Z")
	public boolean method4575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(16) Class2_Sub38 local16 = (Class2_Sub38) this.aClass156_51.method3155(); local16 != null; local16 = (Class2_Sub38) this.aClass156_51.method3150()) {
			if (local16.method4583(arg0, arg1, arg2)) {
				local16.method4580(arg1, arg2, arg3);
				return true;
			}
		}
		return false;
	}
}
