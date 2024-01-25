import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class1_Sub3_Sub16 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
	public int anInt6318 = -1;

	@OriginalMember(owner = "client!ti", name = "E", descriptor = "I")
	public int anInt6325 = 12800;

	@OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
	public int anInt6324 = 0;

	@OriginalMember(owner = "client!ti", name = "J", descriptor = "I")
	public int anInt6328 = 12800;

	@OriginalMember(owner = "client!ti", name = "M", descriptor = "I")
	public int anInt6330 = 0;

	@OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
	public int anInt6326 = -1;

	@OriginalMember(owner = "client!ti", name = "N", descriptor = "Z")
	public boolean aBoolean554 = true;

	@OriginalMember(owner = "client!ti", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString63;

	@OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
	public final int anInt6323;

	@OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
	public final int anInt6333;

	@OriginalMember(owner = "client!ti", name = "L", descriptor = "Ljava/lang/String;")
	public final String aString64;

	@OriginalMember(owner = "client!ti", name = "I", descriptor = "Lclient!am;")
	public final Class14 aClass14_46;

	static {
		new Class142("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class1_Sub3_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString63 = arg1;
		this.anInt6323 = arg3;
		this.anInt6333 = arg0;
		this.anInt6318 = arg4;
		this.aBoolean554 = arg5;
		this.anInt6326 = arg6;
		this.aString64 = arg2;
		if (this.anInt6326 == 255) {
			this.anInt6326 = 0;
		}
		this.aClass14_46 = new Class14();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II[III)Z")
	public boolean method5108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) Class1_Sub6 local11 = (Class1_Sub6) this.aClass14_46.method203(); local11 != null; local11 = (Class1_Sub6) this.aClass14_46.method208()) {
			if (local11.method461(arg1, arg3, arg0)) {
				local11.method460(arg2, arg3, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "([IBII)Z")
	public boolean method5109(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(16) Class1_Sub6 local16 = (Class1_Sub6) this.aClass14_46.method203(); local16 != null; local16 = (Class1_Sub6) this.aClass14_46.method208()) {
			if (local16.method458(arg1, arg2)) {
				local16.method460(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(III)Z")
	public boolean method5110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) Class1_Sub6 local11 = (Class1_Sub6) this.aClass14_46.method203(); local11 != null; local11 = (Class1_Sub6) this.aClass14_46.method208()) {
			if (local11.method458(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "(I)V")
	public void method5112() {
		this.anInt6328 = 12800;
		this.anInt6330 = 0;
		this.anInt6325 = 12800;
		this.anInt6324 = 0;
		for (@Pc(23) Class1_Sub6 local23 = (Class1_Sub6) this.aClass14_46.method203(); local23 != null; local23 = (Class1_Sub6) this.aClass14_46.method208()) {
			if (local23.anInt483 > this.anInt6324) {
				this.anInt6324 = local23.anInt483;
			}
			if (this.anInt6325 > local23.anInt497) {
				this.anInt6325 = local23.anInt497;
			}
			if (this.anInt6330 < local23.anInt493) {
				this.anInt6330 = local23.anInt493;
			}
			if (this.anInt6328 > local23.anInt488) {
				this.anInt6328 = local23.anInt488;
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[III)Z")
	public boolean method5113(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(17) Class1_Sub6 local17 = (Class1_Sub6) this.aClass14_46.method203(); local17 != null; local17 = (Class1_Sub6) this.aClass14_46.method208()) {
			if (local17.method459(arg2, arg0)) {
				local17.method463(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}
}
