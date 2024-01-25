import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class1_Sub5_Sub1 extends Class1_Sub5 implements Interface8 {

	@OriginalMember(owner = "client!pl", name = "D", descriptor = "Lclient!af;")
	public final Class6 aClass6_3;

	@OriginalMember(owner = "client!pl", name = "w", descriptor = "Z")
	private final boolean aBoolean372;

	static {
		new Class62("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!oj;Lclient!cu;IIIIIZIII)V")
	public Class1_Sub5_Sub1(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static354.method5612(arg8, arg9));
		this.aClass6_3 = new Class6(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt6721, super.anInt6720, arg7, arg10);
		this.aBoolean372 = arg1.anInt1274 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)I")
	@Override
	public int method6034() {
		return this.aClass6_3.anInt164;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6032(@OriginalArg(1) Class48 arg0) {
		this.aClass6_3.method68(arg0);
	}

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)V")
	@Override
	public void method6020() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	@Override
	public void method6030() {
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILclient!oj;II)Z")
	@Override
	public boolean method6016(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class159 local16 = this.aClass6_3.method74(false, arg1, super.anInt6720, super.anInt6721, 65536, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class21 local28 = arg1.method2445();
			local28.method3711(super.anInt6721, super.anInt6719, super.anInt6720);
			return local16.method4931(arg0, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILclient!oj;B)Lclient!qh;")
	@Override
	public Class159 method6029(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1) {
		return this.aClass6_3.method74(false, arg1, 0, 0, arg0, false);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIZLclient!a;IBLclient!oj;)V")
	@Override
	public void method6019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class48 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)I")
	@Override
	public int method6027() {
		return this.aClass6_3.anInt161;
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(ILclient!oj;)Lclient!mg;")
	@Override
	public Class7_Sub5 method6013(@OriginalArg(1) Class48 arg0) {
		@Pc(16) Class159 local16 = this.aClass6_3.method74(true, arg0, super.anInt6720, super.anInt6721, 1024, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class21 local23 = arg0.method2445();
		local23.method3711(super.anInt6721, super.anInt6719, super.anInt6720);
		@Pc(33) Class7_Sub5 local33 = null;
		if (this.aBoolean372) {
			local33 = Static234.method4211(1);
		}
		if (this.aClass6_3.aClass7_Sub3_1 == null) {
			local16.method4952(local23, local33 == null ? null : local33.aClass7_Sub6Array1[0], 0);
		} else {
			@Pc(54) Class34 local54 = this.aClass6_3.aClass7_Sub3_1.method519();
			arg0.method2520(local16, local54, local23, local33 == null ? null : local33.aClass7_Sub6Array1[0]);
		}
		this.aClass6_3.method77(local16, true, super.anInt6720 >> 7, super.anInt6720 >> 7, super.anInt6721 >> 7, super.anInt6721 >> 7, arg0);
		return local33;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6028(@OriginalArg(1) Class48 arg0) {
		this.aClass6_3.method73(arg0);
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)I")
	@Override
	public int method6031() {
		return this.aClass6_3.anInt155;
	}

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6015() {
		return false;
	}

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6023(@OriginalArg(1) Class48 arg0) {
		@Pc(22) Class159 local22 = this.aClass6_3.method74(true, arg0, super.anInt6720, super.anInt6721, 131072, true);
		if (local22 != null) {
			this.aClass6_3.method77(local22, false, super.anInt6720 >> 7, super.anInt6720 >> 7, super.anInt6721 >> 7, super.anInt6721 >> 7, arg0);
		}
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6033() {
		return this.aClass6_3.method69();
	}
}
