import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class2_Sub10_Sub8 extends Class2_Sub10 {

	@OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
	public int anInt1904 = -1;

	@OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
	public int anInt1909 = 0;

	@OriginalMember(owner = "client!fl", name = "O", descriptor = "I")
	public int anInt1913 = 0;

	@OriginalMember(owner = "client!fl", name = "R", descriptor = "I")
	public int anInt1915 = 12800;

	@OriginalMember(owner = "client!fl", name = "X", descriptor = "Z")
	public boolean aBoolean132 = true;

	@OriginalMember(owner = "client!fl", name = "ab", descriptor = "I")
	public int anInt1919 = 12800;

	@OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
	public int anInt1905 = -1;

	@OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
	public final int anInt1903;

	@OriginalMember(owner = "client!fl", name = "bb", descriptor = "I")
	public final int anInt1920;

	@OriginalMember(owner = "client!fl", name = "T", descriptor = "Ljava/lang/String;")
	public final String aString19;

	@OriginalMember(owner = "client!fl", name = "E", descriptor = "Ljava/lang/String;")
	public final String aString18;

	@OriginalMember(owner = "client!fl", name = "Z", descriptor = "Lclient!cf;")
	public final Class30 aClass30_6;

	static {
		new Class32("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class2_Sub10_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt1903 = arg0;
		this.anInt1920 = arg3;
		this.aString19 = arg1;
		this.anInt1904 = arg6;
		this.aBoolean132 = arg5;
		this.anInt1905 = arg4;
		this.aString18 = arg2;
		if (this.anInt1904 == 255) {
			this.anInt1904 = 0;
		}
		this.aClass30_6 = new Class30();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[III)Z")
	public boolean method1858(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class2_Sub31 local11 = (Class2_Sub31) this.aClass30_6.method694(); local11 != null; local11 = (Class2_Sub31) this.aClass30_6.method682()) {
			if (local11.method3810(arg1, arg2)) {
				local11.method3808(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIII[I)Z")
	public boolean method1860(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(17) Class2_Sub31 local17 = (Class2_Sub31) this.aClass30_6.method694(); local17 != null; local17 = (Class2_Sub31) this.aClass30_6.method682()) {
			if (local17.method3811(arg2, arg1, arg0)) {
				local17.method3809(arg3, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIB)Z")
	public boolean method1861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(17) Class2_Sub31 local17 = (Class2_Sub31) this.aClass30_6.method694(); local17 != null; local17 = (Class2_Sub31) this.aClass30_6.method682()) {
			if (local17.method3814(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "([IBII)Z")
	public boolean method1863(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(16) Class2_Sub31 local16 = (Class2_Sub31) this.aClass30_6.method694(); local16 != null; local16 = (Class2_Sub31) this.aClass30_6.method682()) {
			if (local16.method3814(arg1, arg2)) {
				local16.method3809(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "(B)V")
	public void method1864() {
		this.anInt1919 = 12800;
		this.anInt1915 = 12800;
		this.anInt1909 = 0;
		this.anInt1913 = 0;
		for (@Pc(23) Class2_Sub31 local23 = (Class2_Sub31) this.aClass30_6.method694(); local23 != null; local23 = (Class2_Sub31) this.aClass30_6.method682()) {
			if (local23.anInt4187 < this.anInt1919) {
				this.anInt1919 = local23.anInt4187;
			}
			if (local23.anInt4189 < this.anInt1915) {
				this.anInt1915 = local23.anInt4189;
			}
			if (this.anInt1909 < local23.anInt4180) {
				this.anInt1909 = local23.anInt4180;
			}
			if (local23.anInt4179 > this.anInt1913) {
				this.anInt1913 = local23.anInt4179;
			}
		}
	}
}
