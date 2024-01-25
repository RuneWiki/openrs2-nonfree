import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class8_Sub1_Sub1 extends Class8_Sub1 {

	@OriginalMember(owner = "client!ah", name = "C", descriptor = "Lclient!nl;")
	private Class2_Sub4 aClass2_Sub4_1;

	@OriginalMember(owner = "client!ah", name = "K", descriptor = "I")
	private int anInt166 = 0;

	@OriginalMember(owner = "client!ah", name = "F", descriptor = "I")
	private int anInt163 = 0;

	@OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
	private final int anInt171 = -1;

	@OriginalMember(owner = "client!ah", name = "I", descriptor = "Z")
	public boolean aBoolean19 = false;

	@OriginalMember(owner = "client!ah", name = "Q", descriptor = "I")
	private int anInt172 = -32768;

	@OriginalMember(owner = "client!ah", name = "R", descriptor = "I")
	private final int anInt173;

	@OriginalMember(owner = "client!ah", name = "O", descriptor = "I")
	public final int anInt170;

	@OriginalMember(owner = "client!ah", name = "H", descriptor = "Lclient!b;")
	private Class14 aClass14_1;

	static {
		new Class159("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
		new Class159(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
		new Class159("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class8_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt173 = arg0;
		this.anInt170 = arg2 + arg1;
		@Pc(40) int local40 = Static116.method2427(this.anInt173).anInt101;
		if (local40 == -1) {
			this.aBoolean19 = true;
		} else {
			this.aBoolean19 = false;
			this.aClass14_1 = Static225.method4042(local40);
		}
		if (this.anInt170 == arg2) {
			Static167.method3265(super.anInt6701, super.anInt6702, this.anInt163, false, this.aClass14_1);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!vq;IIB)Z")
	@Override
	public boolean method5623(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILclient!vq;)Lclient!ni;")
	private Class38 method176(@OriginalArg(1) int arg0, @OriginalArg(2) Class47 arg1) {
		@Pc(13) Class5 local13 = Static116.method2427(this.anInt173);
		return this.aBoolean19 ? local13.method121(arg0, -1, arg1, 0, -1) : local13.method121(arg0, this.anInt163, arg1, this.anInt166, this.anInt171);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
	public void method177() {
		if (this.aClass2_Sub4_1 != null) {
			this.aClass2_Sub4_1.method3930();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!vq;Lclient!ni;I)V")
	private void method178(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class38 arg1) {
		@Pc(13) Class89[] local13 = arg1.method1917();
		@Pc(16) Class175[] local16 = arg1.method1901();
		if ((this.aClass2_Sub4_1 == null || this.aClass2_Sub4_1.aBoolean348) && (local13 != null || local16 != null)) {
			this.aClass2_Sub4_1 = new Class2_Sub4(Static199.anInt4137);
		}
		if (this.aClass2_Sub4_1 != null) {
			this.aClass2_Sub4_1.method3929(arg0, (long) Static199.anInt4137, local13, local16);
			this.aClass2_Sub4_1.method3925(super.aByte77, super.aShort98, super.aShort96, super.aShort97, super.aShort99);
		}
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(B)V")
	@Override
	public void method5625() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLclient!vq;)Lclient!bf;")
	@Override
	public Class2_Sub2 method5624(@OriginalArg(1) Class47 arg0) {
		@Pc(9) Class38 local9 = this.method176(1024, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class57 local16 = arg0.method2706();
		local16.method4189(super.anInt6701, super.anInt6697, super.anInt6702);
		if (this.aClass2_Sub4_1 == null) {
			local9.method1925(local16, null, 0);
		} else {
			@Pc(39) Class176 local39 = this.aClass2_Sub4_1.method3927();
			arg0.method2760(local9, local39, local16, null);
		}
		this.anInt172 = local9.method1921();
		this.method178(arg0, local9);
		return null;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V")
	public void method179(@OriginalArg(1) int arg0) {
		if (this.aBoolean19) {
			return;
		}
		this.anInt166 += arg0;
		while (this.anInt166 > this.aClass14_1.anIntArray11[this.anInt163]) {
			this.anInt166 -= this.aClass14_1.anIntArray11[this.anInt163];
			this.anInt163++;
			if (this.aClass14_1.anIntArray12.length <= this.anInt163) {
				this.aBoolean19 = true;
				break;
			}
		}
		if (!this.aBoolean19) {
			Static167.method3265(super.anInt6701, super.anInt6702, this.anInt163, false, this.aClass14_1);
		}
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5622() {
		return false;
	}

	@OriginalMember(owner = "client!ah", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass2_Sub4_1 != null) {
			this.aClass2_Sub4_1.method3930();
		}
	}

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)I")
	@Override
	public int method5629() {
		return this.anInt172;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!vq;ZLclient!km;IIBI)V")
	@Override
	public void method5621(@OriginalArg(0) Class47 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!vq;B)V")
	@Override
	public void method5627(@OriginalArg(0) Class47 arg0) {
		@Pc(15) Class38 local15 = this.method176(0, arg0);
		if (local15 != null) {
			this.method178(arg0, local15);
		}
	}
}
