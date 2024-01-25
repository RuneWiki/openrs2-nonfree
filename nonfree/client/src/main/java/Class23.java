import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class23 implements Interface8 {

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "Lclient!gu;")
	private Class96 aClass96_8 = new Class96(128);

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "[I")
	private final int[] anIntArray55 = new int[Static405.aClass252_1.anInt6748];

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "[I")
	public final int[] anIntArray54 = new int[Static405.aClass252_1.anInt6748];

	static {
		new Class7("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZI)V")
	public void method596(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class172 local8 = Static45.aClass36_4.method875(arg1);
		@Pc(11) int local11 = local8.anInt4678;
		@Pc(14) int local14 = local8.anInt4680;
		@Pc(21) int local21 = local8.anInt4676;
		@Pc(28) int local28 = Class1_Sub2_Sub1_Sub1.anIntArray8[local21 - local14];
		if (arg0 < 0 || local28 < arg0) {
			arg0 = 0;
		}
		local28 <<= local14;
		this.method597(this.anIntArray55[local11] & ~local28 | local28 & arg0 << local14, local11);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BII)V")
	public void method597(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray55[arg1] = arg0;
		@Pc(22) Class1_Sub27 local22 = (Class1_Sub27) this.aClass96_8.method2335((long) arg1);
		if (local22 == null) {
			local22 = new Class1_Sub27(4611686018427387905L);
			this.aClass96_8.method2341((long) arg1, local22);
		} else if (local22.aLong127 != 4611686018427387905L) {
			local22.aLong127 = Static279.method4058() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIB)V")
	public void method599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray54[arg1] = arg0;
		@Pc(24) Class1_Sub27 local24 = (Class1_Sub27) this.aClass96_8.method2335((long) arg1);
		if (local24 == null) {
			local24 = new Class1_Sub27(Static279.method4058() + 500L);
			this.aClass96_8.method2341((long) arg1, local24);
		} else {
			local24.aLong127 = Static279.method4058() + 500L;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)I")
	@Override
	public int method594(@OriginalArg(0) int arg0) {
		return this.anIntArray54[arg0];
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
	public void method601() {
		for (@Pc(11) int local11 = 0; local11 < Static405.aClass252_1.anInt6748; local11++) {
			@Pc(17) Class79 local17 = Static405.aClass252_1.method5553(local11);
			if (local17 != null && local17.anInt2383 == 0) {
				this.anIntArray55[local11] = 0;
				this.anIntArray54[local11] = 0;
			}
		}
		this.aClass96_8 = new Class96(128);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
	public void method602(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class172 local11 = Static45.aClass36_4.method875(arg1);
		@Pc(14) int local14 = local11.anInt4678;
		@Pc(17) int local17 = local11.anInt4680;
		@Pc(20) int local20 = local11.anInt4676;
		@Pc(27) int local27 = Class1_Sub2_Sub1_Sub1.anIntArray8[local20 - local17];
		if (arg0 < 0 || arg0 > local27) {
			arg0 = 0;
		}
		local27 <<= local17;
		this.method599(local27 & arg0 << local17 | this.anIntArray54[local14] & ~local27, local14);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)I")
	@Override
	public int method595(@OriginalArg(0) int arg0) {
		@Pc(8) Class172 local8 = Static45.aClass36_4.method875(arg0);
		@Pc(11) int local11 = local8.anInt4678;
		@Pc(14) int local14 = local8.anInt4680;
		@Pc(22) int local22 = local8.anInt4676;
		@Pc(28) int local28 = Class1_Sub2_Sub1_Sub1.anIntArray8[local22 - local14];
		return this.anIntArray54[local11] >> local14 & local28;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BZ)I")
	public int method605(@OriginalArg(1) boolean arg0) {
		@Pc(6) long local6 = Static279.method4058();
		for (@Pc(20) Class1_Sub27 local20 = arg0 ? (Class1_Sub27) this.aClass96_8.method2342() : (Class1_Sub27) this.aClass96_8.method2339(); local20 != null; local20 = (Class1_Sub27) this.aClass96_8.method2339()) {
			if ((local20.aLong127 & 0x3FFFFFFFFFFFFFFFL) < local6) {
				if ((local20.aLong127 & 0x4000000000000000L) != 0L) {
					@Pc(45) int local45 = (int) local20.aLong222;
					this.anIntArray54[local45] = this.anIntArray55[local45];
					local20.method6020();
					return local45;
				}
				local20.method6020();
			}
		}
		return -1;
	}
}
