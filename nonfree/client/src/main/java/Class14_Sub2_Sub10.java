import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ija")
public final class Class14_Sub2_Sub10 extends Class14_Sub2 {

	@OriginalMember(owner = "client!ija", name = "v", descriptor = "Z")
	public boolean aBoolean360 = true;

	@OriginalMember(owner = "client!ija", name = "L", descriptor = "I")
	public int anInt4804 = -1;

	@OriginalMember(owner = "client!ija", name = "x", descriptor = "I")
	public int anInt4809 = 12800;

	@OriginalMember(owner = "client!ija", name = "J", descriptor = "I")
	public int anInt4802 = 0;

	@OriginalMember(owner = "client!ija", name = "B", descriptor = "I")
	public int anInt4810 = -1;

	@OriginalMember(owner = "client!ija", name = "N", descriptor = "I")
	public int anInt4811 = 0;

	@OriginalMember(owner = "client!ija", name = "E", descriptor = "I")
	public int anInt4814 = 12800;

	@OriginalMember(owner = "client!ija", name = "A", descriptor = "I")
	public final int anInt4813;

	@OriginalMember(owner = "client!ija", name = "H", descriptor = "Ljava/lang/String;")
	public final String aString66;

	@OriginalMember(owner = "client!ija", name = "y", descriptor = "Ljava/lang/String;")
	public final String aString67;

	@OriginalMember(owner = "client!ija", name = "u", descriptor = "I")
	public final int anInt4801;

	@OriginalMember(owner = "client!ija", name = "w", descriptor = "Lclient!bd;")
	public final Class32 aClass32_25;

	@OriginalMember(owner = "client!ija", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class14_Sub2_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt4813 = arg0;
		this.aString66 = arg1;
		this.aBoolean360 = arg5;
		this.anInt4804 = arg4;
		this.aString67 = arg2;
		this.anInt4810 = arg6;
		this.anInt4801 = arg3;
		if (this.anInt4810 == 255) {
			this.anInt4810 = 0;
		}
		this.aClass32_25 = new Class32();
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(Z)V")
	public void method4288() {
		this.anInt4802 = 0;
		this.anInt4814 = 12800;
		this.anInt4811 = 0;
		this.anInt4809 = 12800;
		for (@Pc(32) Class14_Sub51 local32 = (Class14_Sub51) this.aClass32_25.method584(); local32 != null; local32 = (Class14_Sub51) this.aClass32_25.method577()) {
			if (local32.anInt10607 < this.anInt4809) {
				this.anInt4809 = local32.anInt10607;
			}
			if (this.anInt4811 < local32.anInt10603) {
				this.anInt4811 = local32.anInt10603;
			}
			if (local32.anInt10600 > this.anInt4802) {
				this.anInt4802 = local32.anInt10600;
			}
			if (this.anInt4814 > local32.anInt10612) {
				this.anInt4814 = local32.anInt10612;
			}
		}
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "([IIIII)Z")
	public boolean method4289(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class14_Sub51 local15 = (Class14_Sub51) this.aClass32_25.method584(); local15 != null; local15 = (Class14_Sub51) this.aClass32_25.method577()) {
			if (local15.method9069(arg2, arg1, arg3)) {
				local15.method9063(arg0, arg3, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(I[III)Z")
	public boolean method4290(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(9) Class14_Sub51 local9 = (Class14_Sub51) this.aClass32_25.method584(); local9 != null; local9 = (Class14_Sub51) this.aClass32_25.method577()) {
			if (local9.method9070(arg0, arg2)) {
				local9.method9068(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(BII)Z")
	public boolean method4292(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(15) Class14_Sub51 local15 = (Class14_Sub51) this.aClass32_25.method584(); local15 != null; local15 = (Class14_Sub51) this.aClass32_25.method577()) {
			if (local15.method9064(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(II[II)Z")
	public boolean method4293(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(9) Class14_Sub51 local9 = (Class14_Sub51) this.aClass32_25.method584(); local9 != null; local9 = (Class14_Sub51) this.aClass32_25.method577()) {
			if (local9.method9064(arg2, arg0)) {
				local9.method9063(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}
}
