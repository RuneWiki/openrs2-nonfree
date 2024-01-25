import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class114 {

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "Lclient!si;")
	private final Class338 aClass338_12 = new Class338(16);

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "Lclient!lb;")
	private final Class221 aClass221_48;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;)V")
	public Class114(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2) {
		this.aClass221_48 = arg2;
		this.aClass221_48.method5065(29);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Lclient!qp;")
	private Class308 method2785(@OriginalArg(0) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_12;
		@Pc(16) Class308 local16;
		synchronized (this.aClass338_12) {
			local16 = (Class308) this.aClass338_12.method8049((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class221 local30 = this.aClass221_48;
		@Pc(47) byte[] local47;
		synchronized (this.aClass221_48) {
			local47 = this.aClass221_48.method5089(arg0, 29);
		}
		local16 = new Class308();
		if (local47 != null) {
			local16.method7497(new Class3_Sub28(local47));
		}
		@Pc(73) Class338 local73 = this.aClass338_12;
		synchronized (this.aClass338_12) {
			this.aClass338_12.method8044((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!gba;IIII)Lclient!op;")
	public Class275 method2786(@OriginalArg(0) int arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class87[] local7 = null;
		@Pc(12) Class308 local12 = this.method2785(arg4);
		if (local12.anIntArray487 != null) {
			local7 = new Class87[local12.anIntArray487.length];
			for (@Pc(31) int local31 = 0; local31 < local7.length; local31++) {
				@Pc(41) Class119 local41 = arg1.method2988(local12.anIntArray487[local31]);
				local7[local31] = new Class87(local41.anInt3286, local41.anInt3281, local41.anInt3289, local41.anInt3278, local41.anInt3283, local41.anInt3288, local41.anInt3282, local41.aBoolean269, local41.anInt3285, local41.anInt3280, local41.anInt3290);
			}
		}
		return new Class275(local12.anInt8969, local7, local12.anInt8970, arg2, arg0, arg3, local12.anInt8968, local12.anInt8971);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
	public void method2788() {
		@Pc(6) Class338 local6 = this.aClass338_12;
		synchronized (this.aClass338_12) {
			this.aClass338_12.method8047();
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
	public void method2793() {
		@Pc(2) Class338 local2 = this.aClass338_12;
		synchronized (this.aClass338_12) {
			this.aClass338_12.method8051();
		}
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(II)V")
	public void method2794() {
		@Pc(2) Class338 local2 = this.aClass338_12;
		synchronized (this.aClass338_12) {
			this.aClass338_12.method8052(5);
		}
	}
}
