import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class15_Sub2_Sub6 extends Class15_Sub2 {

	@OriginalMember(owner = "client!qs", name = "H", descriptor = "Lclient!io;")
	private Class60_Sub4 aClass60_Sub4_6;

	@OriginalMember(owner = "client!qs", name = "v", descriptor = "I")
	private int anInt7707 = 0;

	@OriginalMember(owner = "client!qs", name = "y", descriptor = "I")
	private int anInt7710 = 0;

	@OriginalMember(owner = "client!qs", name = "K", descriptor = "I")
	private int anInt7719 = 0;

	@OriginalMember(owner = "client!qs", name = "R", descriptor = "Z")
	public boolean aBoolean509 = false;

	@OriginalMember(owner = "client!qs", name = "T", descriptor = "I")
	private int anInt7726 = -32768;

	@OriginalMember(owner = "client!qs", name = "Y", descriptor = "I")
	private final int anInt7729 = -1;

	@OriginalMember(owner = "client!qs", name = "M", descriptor = "I")
	private final int anInt7721;

	@OriginalMember(owner = "client!qs", name = "D", descriptor = "I")
	private final int anInt7714;

	@OriginalMember(owner = "client!qs", name = "I", descriptor = "I")
	public final int anInt7718;

	@OriginalMember(owner = "client!qs", name = "A", descriptor = "Lclient!ct;")
	private Class63 aClass63_2;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class15_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt7721 = arg0;
		this.anInt7714 = arg4;
		this.anInt7718 = arg2 + arg1;
		this.anInt7710 = arg12;
		@Pc(50) Class239 local50 = Static475.aClass291_2.method6548(this.anInt7721);
		@Pc(53) int local53 = local50.anInt6960;
		if (local53 == -1) {
			this.aBoolean509 = true;
		} else {
			this.aClass63_2 = Static388.aClass324_2.method7265(local53);
			this.aBoolean509 = false;
		}
		if (arg2 == this.anInt7718) {
			Static32.method514(false, super.anInt8911, super.aByte98, this.aClass63_2, super.anInt8913, this.anInt7707);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZLclient!oa;)V")
	@Override
	public void method7160(@OriginalArg(1) Class90 arg0) {
		@Pc(18) Class24 local18 = this.method6142(arg0, 0, this.anInt7721);
		if (local18 != null) {
			@Pc(23) Class93 local23 = arg0.method7455();
			local23.GA(super.anInt8911, super.anInt8915, super.anInt8913);
			this.method6148(local23, arg0, local18);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!oa;B)Lclient!ac;")
	@Override
	public Class4 method7156(@OriginalArg(0) Class90 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!qs", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass60_Sub4_6 != null) {
			this.aClass60_Sub4_6.method3590();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)V")
	@Override
	public void method7165() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!oa;)Lclient!wc;")
	@Override
	public Class60_Sub8 method7155(@OriginalArg(1) Class90 arg0) {
		@Pc(19) Class24 local19 = this.method6142(arg0, (this.anInt7710 == 0 ? 0 : 5) | 0x800, this.anInt7721);
		if (local19 == null) {
			return null;
		}
		if (this.anInt7710 != 0) {
			local19.I(this.anInt7710 * 2048);
		}
		@Pc(38) Class93 local38 = arg0.method7455();
		local38.GA(super.anInt8911, super.anInt8915, super.anInt8913);
		this.method6148(local38, arg0, local19);
		if (this.aClass60_Sub4_6 == null) {
			local19.method7393(local38, null, 0);
		} else {
			@Pc(61) Class127 local61 = this.aClass60_Sub4_6.method3587();
			arg0.method7470(local19, local61, local38, null, 0);
		}
		this.anInt7726 = local19.DA();
		return null;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7164(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!oa;II)Lclient!ba;")
	private Class24 method6142(@OriginalArg(1) Class90 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class239 local8 = Static475.aClass291_2.method6548(arg2);
		@Pc(13) Class46 local13 = Static496.aClass46Array4[super.aByte98];
		@Pc(26) Class46 local26 = this.anInt7714 >= 3 ? null : Static496.aClass46Array4[this.anInt7714 + 1];
		return this.aBoolean509 ? local8.method5577(super.anInt8913, -1, arg1, 0, Static388.aClass324_2, super.anInt8915, arg0, -1, local13, super.anInt8911, local26) : local8.method5577(super.anInt8913, this.anInt7707, arg1, this.anInt7719, Static388.aClass324_2, super.anInt8915, arg0, this.anInt7729, local13, super.anInt8911, local26);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)V")
	public void method6143(@OriginalArg(0) int arg0) {
		if (this.aBoolean509) {
			return;
		}
		this.anInt7719 += arg0;
		while (this.aClass63_2.anIntArray128[this.anInt7707] < this.anInt7719) {
			this.anInt7719 -= this.aClass63_2.anIntArray128[this.anInt7707];
			this.anInt7707++;
			if (this.anInt7707 >= this.aClass63_2.anIntArray127.length) {
				this.aBoolean509 = true;
				break;
			}
		}
		if (!this.aBoolean509) {
			Static32.method514(false, super.anInt8911, super.aByte98, this.aClass63_2, super.anInt8913, this.anInt7707);
		}
	}

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7162() {
		return false;
	}

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "(I)I")
	@Override
	public int method7123() {
		return this.anInt7726;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILclient!gfa;IIZLclient!oa;)V")
	@Override
	public void method7163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class90 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	public void method6146() {
		if (this.aClass60_Sub4_6 != null) {
			this.aClass60_Sub4_6.method3590();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!q;Lclient!oa;Lclient!ba;I)V")
	private void method6148(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) Class24 arg2) {
		arg2.method7388(arg0);
		@Pc(9) Class33[] local9 = arg2.method7383();
		@Pc(12) Class335[] local12 = arg2.method7402();
		if ((this.aClass60_Sub4_6 == null || this.aClass60_Sub4_6.aBoolean316) && (local9 != null || local12 != null)) {
			this.aClass60_Sub4_6 = Static229.method3576(Static363.anInt6671, true);
		}
		if (this.aClass60_Sub4_6 != null) {
			this.aClass60_Sub4_6.method3580(arg1, (long) Static363.anInt6671, local9, local12);
			this.aClass60_Sub4_6.method3577(super.aByte98, super.aShort116, super.aShort115, super.aShort114, super.aShort117);
		}
	}
}
