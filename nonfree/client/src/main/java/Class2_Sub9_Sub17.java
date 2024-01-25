import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class2_Sub9_Sub17 extends Class2_Sub9 {

	@OriginalMember(owner = "client!os", name = "T", descriptor = "I")
	public int anInt5163 = 12800;

	@OriginalMember(owner = "client!os", name = "cb", descriptor = "I")
	public int anInt5170 = 0;

	@OriginalMember(owner = "client!os", name = "Z", descriptor = "Z")
	public boolean aBoolean450 = true;

	@OriginalMember(owner = "client!os", name = "db", descriptor = "I")
	public int anInt5171 = 12800;

	@OriginalMember(owner = "client!os", name = "fb", descriptor = "I")
	public int anInt5173 = -1;

	@OriginalMember(owner = "client!os", name = "Y", descriptor = "I")
	public int anInt5167 = -1;

	@OriginalMember(owner = "client!os", name = "nb", descriptor = "I")
	public int anInt5177 = 0;

	@OriginalMember(owner = "client!os", name = "S", descriptor = "Ljava/lang/String;")
	public final String aString49;

	@OriginalMember(owner = "client!os", name = "eb", descriptor = "I")
	public final int anInt5172;

	@OriginalMember(owner = "client!os", name = "ab", descriptor = "I")
	public final int anInt5168;

	@OriginalMember(owner = "client!os", name = "hb", descriptor = "Ljava/lang/String;")
	public final String aString50;

	@OriginalMember(owner = "client!os", name = "jb", descriptor = "Lclient!sf;")
	public final Class180 aClass180_35;

	static {
		new Class140("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class2_Sub9_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString49 = arg2;
		this.anInt5172 = arg0;
		this.aBoolean450 = arg5;
		this.anInt5168 = arg3;
		this.anInt5173 = arg4;
		this.anInt5167 = arg6;
		this.aString50 = arg1;
		if (this.anInt5167 == 255) {
			this.anInt5167 = 0;
		}
		this.aClass180_35 = new Class180();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IBI[I)Z")
	public boolean method4363(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(16) Class2_Sub15 local16 = (Class2_Sub15) this.aClass180_35.method4919(); local16 != null; local16 = (Class2_Sub15) this.aClass180_35.method4916()) {
			if (local16.method1834(arg1, arg0)) {
				local16.method1830(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!os", name = "h", descriptor = "(I)V")
	public void method4365() {
		this.anInt5171 = 12800;
		this.anInt5163 = 12800;
		this.anInt5170 = 0;
		this.anInt5177 = 0;
		for (@Pc(23) Class2_Sub15 local23 = (Class2_Sub15) this.aClass180_35.method4919(); local23 != null; local23 = (Class2_Sub15) this.aClass180_35.method4916()) {
			if (local23.anInt1801 > this.anInt5177) {
				this.anInt5177 = local23.anInt1801;
			}
			if (local23.anInt1807 > this.anInt5170) {
				this.anInt5170 = local23.anInt1807;
			}
			if (this.anInt5171 > local23.anInt1800) {
				this.anInt5171 = local23.anInt1800;
			}
			if (local23.anInt1796 < this.anInt5163) {
				this.anInt5163 = local23.anInt1796;
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(III)Z")
	public boolean method4366(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class2_Sub15 local11 = (Class2_Sub15) this.aClass180_35.method4919(); local11 != null; local11 = (Class2_Sub15) this.aClass180_35.method4916()) {
			if (local11.method1834(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IBII[I)Z")
	public boolean method4368(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(16) Class2_Sub15 local16 = (Class2_Sub15) this.aClass180_35.method4919(); local16 != null; local16 = (Class2_Sub15) this.aClass180_35.method4916()) {
			if (local16.method1831(arg2, arg0, arg1)) {
				local16.method1830(arg2, arg3, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([IIII)Z")
	public boolean method4370(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) Class2_Sub15 local11 = (Class2_Sub15) this.aClass180_35.method4919(); local11 != null; local11 = (Class2_Sub15) this.aClass180_35.method4916()) {
			if (local11.method1835(arg2, arg1)) {
				local11.method1833(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}
}
