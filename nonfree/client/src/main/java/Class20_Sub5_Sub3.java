import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class20_Sub5_Sub3 extends Class20_Sub5 implements Interface7 {

	@OriginalMember(owner = "client!sk", name = "ib", descriptor = "[B")
	public static final byte[] aByteArray109;

	@OriginalMember(owner = "client!sk", name = "W", descriptor = "Lclient!so;")
	private Class271 aClass271_7;

	@OriginalMember(owner = "client!sk", name = "I", descriptor = "Z")
	private boolean aBoolean581;

	@OriginalMember(owner = "client!sk", name = "Y", descriptor = "B")
	private final byte aByte89;

	@OriginalMember(owner = "client!sk", name = "M", descriptor = "B")
	private final byte aByte88;

	@OriginalMember(owner = "client!sk", name = "z", descriptor = "Z")
	private final boolean aBoolean580;

	@OriginalMember(owner = "client!sk", name = "P", descriptor = "Z")
	private final boolean aBoolean582;

	@OriginalMember(owner = "client!sk", name = "ab", descriptor = "S")
	private final short aShort113;

	@OriginalMember(owner = "client!sk", name = "X", descriptor = "Z")
	private final boolean aBoolean583;

	@OriginalMember(owner = "client!sk", name = "T", descriptor = "Lclient!k;")
	private Class1_Sub2_Sub2 aClass1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!sk", name = "db", descriptor = "Lclient!r;")
	private Class97 aClass97_7;

	static {
		@Pc(140) int local140 = 0;
		aByteArray109 = new byte[32896];
		for (@Pc(145) int local145 = 0; local145 < 256; local145++) {
			for (@Pc(148) int local148 = 0; local148 <= local145; local148++) {
				aByteArray109[local140++] = (byte) (255.0D / Math.sqrt((double) ((float) (local148 * local148 + local145 * local145 + 65535) / 65535.0F)));
			}
		}
		new Class45("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!qa;Lclient!cn;IIIIZIZ)V")
	public Class20_Sub5_Sub3(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt1648, arg1.aBoolean141, arg1.aBoolean131);
		super.anInt7848 = arg3;
		this.aBoolean581 = arg8;
		this.aByte89 = (byte) arg7;
		super.anInt7851 = arg5;
		this.aByte88 = (byte) arg2;
		this.aBoolean580 = arg6;
		this.aBoolean582 = arg1.anInt1632 != 0 && !arg6;
		this.aShort113 = (short) arg1.anInt1646;
		this.aBoolean583 = arg0.method7153() && arg1.aBoolean132 && !this.aBoolean580 && Static286.aClass1_Sub15_Sub1_1.method6358(Static449.anInt7876) != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean581) {
			local69 |= 0x10000;
		}
		@Pc(84) Class147 local84 = this.method6958(arg0, this.aBoolean583, local69);
		if (local84 != null) {
			this.aClass1_Sub2_Sub2_6 = local84.aClass1_Sub2_Sub2_3;
			this.aClass97_7 = local84.aClass97_4;
			if (this.aBoolean581) {
				this.aClass97_7 = this.aClass97_7.method6770((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(ILclient!qa;)Lclient!oj;")
	@Override
	public Class46_Sub6 method8039(@OriginalArg(1) Class4 arg0) {
		if (this.aClass97_7 == null) {
			return null;
		}
		@Pc(16) Class128 local16 = arg0.method7165();
		local16.oa(super.anInt7848, super.anInt7850, super.anInt7851);
		@Pc(26) Class46_Sub6 local26 = null;
		if (this.aBoolean582) {
			local26 = Static490.method7528(1);
		}
		this.aClass97_7.method6773(local16, local26 == null ? null : local26.aClass46_Sub1Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZLclient!oe;ILclient!qa;III)V")
	@Override
	public void method8034(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class20_Sub5_Sub3) {
			@Pc(5) Class20_Sub5_Sub3 local5 = (Class20_Sub5_Sub3) arg1;
			if (this.aClass97_7 != null && local5.aClass97_7 != null) {
				this.aClass97_7.method6769(local5.aClass97_7, arg5, arg4, arg2, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)I")
	@Override
	public int method8047() {
		return 22;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(ILclient!qa;)Lclient!so;")
	@Override
	public Class271 method8031(@OriginalArg(1) Class4 arg0) {
		if (this.aClass271_7 == null) {
			this.aClass271_7 = Static161.method2903(super.anInt7850, super.anInt7848, this.method6963(0, arg0), super.anInt7851);
		}
		return this.aClass271_7;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)I")
	@Override
	public int method8044() {
		return this.aByte89;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLclient!qa;ZI)Lclient!jc;")
	private Class147 method6958(@OriginalArg(1) Class4 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(20) Class51 local20 = Static398.aClass18_4.method609(this.aShort113 & 0xFFFF);
		@Pc(45) Class7 local45;
		@Pc(31) Class7 local31;
		if (this.aBoolean580) {
			local31 = Static411.aClass7Array12[0];
			local45 = Static207.aClass7Array7[this.aByte88];
		} else {
			if (this.aByte88 >= 3) {
				local31 = null;
			} else {
				local31 = Static411.aClass7Array12[this.aByte88 + 1];
			}
			local45 = Static411.aClass7Array12[this.aByte88];
		}
		return local20.method1621(local45, arg1, arg2, local31, arg0, super.anInt7848, super.anInt7851, super.anInt7850, this.aByte89, 22);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method8045(@OriginalArg(0) Class4 arg0) {
		@Pc(24) Class1_Sub2_Sub2 local24;
		if (this.aClass1_Sub2_Sub2_6 == null && this.aBoolean583) {
			@Pc(35) Class147 local35 = this.method6958(arg0, true, 262144);
			local24 = local35 == null ? null : local35.aClass1_Sub2_Sub2_3;
		} else {
			local24 = this.aClass1_Sub2_Sub2_6;
			this.aClass1_Sub2_Sub2_6 = null;
		}
		if (local24 != null) {
			Static101.method2062(local24, this.aByte88, super.anInt7848, super.anInt7851, null);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method8037(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class97 local9 = this.method6963(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class128 local14 = arg0.method7165();
			local14.oa(super.anInt7848, super.anInt7850, super.anInt7851);
			return local9.method6785(arg1, arg2, local14, false);
		}
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8049() {
		return this.aBoolean583;
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)V")
	@Override
	public void method8036() {
		this.aBoolean581 = false;
		if (this.aClass97_7 != null) {
			this.aClass97_7.m(this.aClass97_7.ba() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)I")
	@Override
	public int method8046() {
		return this.aShort113 & 0xFFFF;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method8043(@OriginalArg(1) Class4 arg0) {
		@Pc(19) Class1_Sub2_Sub2 local19;
		if (this.aClass1_Sub2_Sub2_6 == null && this.aBoolean583) {
			@Pc(30) Class147 local30 = this.method6958(arg0, true, 262144);
			local19 = local30 == null ? null : local30.aClass1_Sub2_Sub2_3;
		} else {
			local19 = this.aClass1_Sub2_Sub2_6;
			this.aClass1_Sub2_Sub2_6 = null;
		}
		if (local19 != null) {
			Static509.method7778(local19, this.aByte88, super.anInt7848, super.anInt7851, null);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method8030(@OriginalArg(1) Class4 arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	@Override
	public Class97 method8048(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		return this.method6963(arg0, arg1);
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V")
	@Override
	public void method8050() {
		if (this.aClass97_7 != null) {
			this.aClass97_7.method6777();
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILclient!qa;)Lclient!r;")
	private Class97 method6963(@OriginalArg(0) int arg0, @OriginalArg(2) Class4 arg1) {
		if (this.aClass97_7 != null && arg1.method7167(this.aClass97_7.ba(), arg0) == 0) {
			return this.aClass97_7;
		} else {
			@Pc(31) Class147 local31 = this.method6958(arg1, false, arg0);
			return local31 == null ? null : local31.aClass97_4;
		}
	}

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8038() {
		return this.aBoolean581;
	}
}
