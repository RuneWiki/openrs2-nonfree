import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class6_Sub4_Sub12 extends Class6_Sub4 {

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
	public int anInt6890 = -1;

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
	public int anInt6894 = 12800;

	@OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
	public int anInt6898 = 0;

	@OriginalMember(owner = "client!ob", name = "K", descriptor = "Z")
	public boolean aBoolean515 = true;

	@OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
	public int anInt6901 = -1;

	@OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
	public int anInt6895 = 0;

	@OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
	public int anInt6896 = 12800;

	@OriginalMember(owner = "client!ob", name = "F", descriptor = "Ljava/lang/String;")
	public final String aString79;

	@OriginalMember(owner = "client!ob", name = "A", descriptor = "Ljava/lang/String;")
	public final String aString78;

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
	public final int anInt6893;

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
	public final int anInt6889;

	@OriginalMember(owner = "client!ob", name = "C", descriptor = "Lclient!mfa;")
	public final Class211 aClass211_57;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class6_Sub4_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString79 = arg2;
		this.aString78 = arg1;
		this.anInt6890 = arg4;
		this.anInt6893 = arg0;
		this.aBoolean515 = arg5;
		this.anInt6889 = arg3;
		this.anInt6901 = arg6;
		if (this.anInt6901 == 255) {
			this.anInt6901 = 0;
		}
		this.aClass211_57 = new Class211();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[IIII)Z")
	public boolean method5807(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(17) Class6_Sub20 local17 = (Class6_Sub20) this.aClass211_57.method5183(); local17 != null; local17 = (Class6_Sub20) this.aClass211_57.method5177()) {
			if (local17.method2697(arg0, arg3, arg2)) {
				local17.method2691(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([IIII)Z")
	public boolean method5809(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(16) Class6_Sub20 local16 = (Class6_Sub20) this.aClass211_57.method5183(); local16 != null; local16 = (Class6_Sub20) this.aClass211_57.method5177()) {
			if (local16.method2692(arg2, arg1)) {
				local16.method2691(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public void method5810() {
		this.anInt6895 = 0;
		this.anInt6894 = 12800;
		this.anInt6896 = 12800;
		this.anInt6898 = 0;
		for (@Pc(31) Class6_Sub20 local31 = (Class6_Sub20) this.aClass211_57.method5183(); local31 != null; local31 = (Class6_Sub20) this.aClass211_57.method5177()) {
			if (this.anInt6898 < local31.anInt3053) {
				this.anInt6898 = local31.anInt3053;
			}
			if (local31.anInt3054 < this.anInt6896) {
				this.anInt6896 = local31.anInt3054;
			}
			if (this.anInt6894 > local31.anInt3059) {
				this.anInt6894 = local31.anInt3059;
			}
			if (this.anInt6895 < local31.anInt3049) {
				this.anInt6895 = local31.anInt3049;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([IBII)Z")
	public boolean method5813(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class6_Sub20 local11 = (Class6_Sub20) this.aClass211_57.method5183(); local11 != null; local11 = (Class6_Sub20) this.aClass211_57.method5177()) {
			if (local11.method2695(arg2, arg1)) {
				local11.method2696(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIB)Z")
	public boolean method5814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(16) Class6_Sub20 local16 = (Class6_Sub20) this.aClass211_57.method5183(); local16 != null; local16 = (Class6_Sub20) this.aClass211_57.method5177()) {
			if (local16.method2692(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}
}
