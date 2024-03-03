import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class11_Sub5_Sub4 extends Class11_Sub5 {

	@OriginalMember(owner = "client!uh", name = "w", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_9 = new Class36();

	@OriginalMember(owner = "client!uh", name = "W", descriptor = "Z")
	public static boolean aBoolean446 = false;

	@OriginalMember(owner = "client!uh", name = "V", descriptor = "J")
	public static long aLong202 = -1L;

	@OriginalMember(owner = "client!uh", name = "y", descriptor = "Lclient!oh;")
	private Class12_Sub5 aClass12_Sub5_7;

	@OriginalMember(owner = "client!uh", name = "N", descriptor = "I")
	private int anInt6506 = -32768;

	@OriginalMember(owner = "client!uh", name = "F", descriptor = "I")
	private final int anInt6498 = -1;

	@OriginalMember(owner = "client!uh", name = "Q", descriptor = "Z")
	public boolean aBoolean445 = false;

	@OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
	private int anInt6497 = 0;

	@OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
	private int anInt6512 = 0;

	@OriginalMember(owner = "client!uh", name = "A", descriptor = "I")
	private final int anInt6493;

	@OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
	public final int anInt6492;

	@OriginalMember(owner = "client!uh", name = "T", descriptor = "Lclient!nb;")
	private Class157 aClass157_3;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 325)
	public Class11_Sub5_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt6493 = arg0;
		this.anInt6492 = arg1 + arg2;
		@Pc(41) int local41 = Static299.aClass211_2.method5408(this.anInt6493).anInt2445;
		if (local41 == -1) {
			this.aBoolean445 = true;
		} else {
			this.aBoolean445 = false;
			this.aClass157_3 = Static37.aClass85_1.method2373(local41);
		}
		if (arg2 == this.anInt6492) {
			Static1.method4(this.aClass157_3, false, super.aByte78, super.anInt6768, super.anInt6770, this.anInt6497);
		}
	}

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "(I)Z", line = 4)
	@Override
	public boolean method6077() {
		return false;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!wm;B)V", line = 15)
	@Override
	public void method6071(@OriginalArg(0) Class19 arg0) {
		@Pc(9) Class31 local9 = this.method5875(0, arg0);
		if (local9 != null) {
			this.method5874(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)V", line = 32)
	@Override
	public void method6070() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!gn;Lclient!wm;Z)V", line = 45)
	private void method5874(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class19 arg1) {
		@Pc(6) Class114[] local6 = arg0.method3809();
		@Pc(9) Class163[] local9 = arg0.method3841();
		if ((this.aClass12_Sub5_7 == null || this.aClass12_Sub5_7.aBoolean322) && (local6 != null || local9 != null)) {
			this.aClass12_Sub5_7 = new Class12_Sub5(Class83.anInt2345);
		}
		if (this.aClass12_Sub5_7 != null) {
			this.aClass12_Sub5_7.method4358(arg1, (long) Class83.anInt2345, local6, local9);
			this.aClass12_Sub5_7.method4362(super.aByte78, super.aShort103, super.aShort104, super.aShort101, super.aShort102);
		}
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;", line = 75)
	@Override
	public Class12_Sub4 method6074(@OriginalArg(0) Class19 arg0) {
		@Pc(9) Class31 local9 = this.method5875(1024, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class14 local16 = arg0.method2810();
		local16.method3923(super.anInt6768, super.anInt6769, super.anInt6770);
		if (this.aClass12_Sub5_7 == null) {
			local9.method3836(local16, null, 0);
		} else {
			@Pc(41) Class224 local41 = this.aClass12_Sub5_7.method4359();
			arg0.method2826(local9, local41, local16, null);
		}
		this.anInt6506 = local9.method3803();
		this.method5874(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "(I)I", line = 107)
	@Override
	public int method6081() {
		return this.anInt6506;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILclient!wm;Z)Lclient!gn;", line = 118)
	private Class31 method5875(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		@Pc(9) Class91 local9 = Static299.aClass211_2.method5408(this.anInt6493);
		return this.aBoolean445 ? local9.method2435(-1, 0, arg1, arg0, Static37.aClass85_1, -1) : local9.method2435(this.anInt6498, this.anInt6512, arg1, arg0, Static37.aClass85_1, this.anInt6497);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V", line = 169)
	@Override
	public void method6076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "(B)V", line = 276)
	public void method5879() {
		if (this.aClass12_Sub5_7 != null) {
			this.aClass12_Sub5_7.method4355();
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V", line = 295)
	public void method5880(@OriginalArg(0) int arg0) {
		if (this.aBoolean445) {
			return;
		}
		this.anInt6512 += arg0;
		while (this.anInt6512 > this.aClass157_3.anIntArray261[this.anInt6497]) {
			this.anInt6512 -= this.aClass157_3.anIntArray261[this.anInt6497];
			this.anInt6497++;
			if (this.anInt6497 >= this.aClass157_3.anIntArray262.length) {
				this.aBoolean445 = true;
				break;
			}
		}
		if (!this.aBoolean445) {
			Static1.method4(this.aClass157_3, false, super.aByte78, super.anInt6768, super.anInt6770, this.anInt6497);
		}
	}

	@OriginalMember(owner = "client!uh", name = "finalize", descriptor = "()V", line = 374)
	@Override
	public void finalize() {
		if (this.aClass12_Sub5_7 != null) {
			this.aClass12_Sub5_7.method4355();
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIBLclient!wm;)Z", line = 399)
	@Override
	public boolean method6069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		return false;
	}
}
