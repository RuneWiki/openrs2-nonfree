import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class14_Sub2_Sub14 extends Class14_Sub2 {

	@OriginalMember(owner = "client!o", name = "x", descriptor = "I")
	public int anInt4448 = -1;

	@OriginalMember(owner = "client!o", name = "C", descriptor = "I")
	public int anInt4452 = -1;

	@OriginalMember(owner = "client!o", name = "v", descriptor = "I")
	public int anInt4447 = 12800;

	@OriginalMember(owner = "client!o", name = "A", descriptor = "I")
	public int anInt4450 = 12800;

	@OriginalMember(owner = "client!o", name = "O", descriptor = "Z")
	public boolean aBoolean295 = true;

	@OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
	public int anInt4461 = 0;

	@OriginalMember(owner = "client!o", name = "U", descriptor = "I")
	public int anInt4464 = 0;

	@OriginalMember(owner = "client!o", name = "J", descriptor = "Ljava/lang/String;")
	public final String aString160;

	@OriginalMember(owner = "client!o", name = "D", descriptor = "Ljava/lang/String;")
	public final String aString159;

	@OriginalMember(owner = "client!o", name = "F", descriptor = "I")
	public final int anInt4454;

	@OriginalMember(owner = "client!o", name = "P", descriptor = "I")
	public final int anInt4460;

	@OriginalMember(owner = "client!o", name = "N", descriptor = "Lclient!bd;")
	public final Class18 aClass18_21;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class14_Sub2_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.aString160 = arg1;
		this.anInt4448 = arg6;
		this.aString159 = arg2;
		this.anInt4454 = arg3;
		this.anInt4452 = arg4;
		this.anInt4460 = arg0;
		this.aBoolean295 = arg5;
		if (this.anInt4448 == 255) {
			this.anInt4448 = 0;
		}
		this.aClass18_21 = new Class18();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I[IIB)Z")
	public boolean method3988(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) Class14_Sub33 local11 = (Class14_Sub33) this.aClass18_21.method459(); local11 != null; local11 = (Class14_Sub33) this.aClass18_21.method453()) {
			if (local11.method5326(arg0, arg2)) {
				local11.method5331(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
	public void method3989() {
		this.anInt4461 = 0;
		this.anInt4450 = 12800;
		this.anInt4464 = 0;
		this.anInt4447 = 12800;
		for (@Pc(27) Class14_Sub33 local27 = (Class14_Sub33) this.aClass18_21.method459(); local27 != null; local27 = (Class14_Sub33) this.aClass18_21.method453()) {
			if (this.anInt4464 < local27.anInt5889) {
				this.anInt4464 = local27.anInt5889;
			}
			if (this.anInt4450 > local27.anInt5893) {
				this.anInt4450 = local27.anInt5893;
			}
			if (local27.anInt5894 > this.anInt4461) {
				this.anInt4461 = local27.anInt5894;
			}
			if (this.anInt4447 > local27.anInt5887) {
				this.anInt4447 = local27.anInt5887;
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIB[I)Z")
	public boolean method3990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(21) Class14_Sub33 local21 = (Class14_Sub33) this.aClass18_21.method459(); local21 != null; local21 = (Class14_Sub33) this.aClass18_21.method453()) {
			if (local21.method5327(arg0, arg1, arg2)) {
				local21.method5329(arg2, arg3, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I[III)Z")
	public boolean method3994(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(16) Class14_Sub33 local16 = (Class14_Sub33) this.aClass18_21.method459(); local16 != null; local16 = (Class14_Sub33) this.aClass18_21.method453()) {
			if (local16.method5333(arg0, arg2)) {
				local16.method5329(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)Z")
	public boolean method3995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class14_Sub33 local11 = (Class14_Sub33) this.aClass18_21.method459(); local11 != null; local11 = (Class14_Sub33) this.aClass18_21.method453()) {
			if (local11.method5333(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}
}
