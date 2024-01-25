import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class2_Sub1_Sub14 extends Class2_Sub1 {

	@OriginalMember(owner = "client!po", name = "D", descriptor = "I")
	public int anInt5746 = 12800;

	@OriginalMember(owner = "client!po", name = "t", descriptor = "I")
	public int anInt5741 = 12800;

	@OriginalMember(owner = "client!po", name = "A", descriptor = "I")
	public int anInt5744 = -1;

	@OriginalMember(owner = "client!po", name = "B", descriptor = "I")
	public int anInt5745 = -1;

	@OriginalMember(owner = "client!po", name = "K", descriptor = "I")
	public int anInt5751 = 0;

	@OriginalMember(owner = "client!po", name = "G", descriptor = "Z")
	public boolean aBoolean405 = true;

	@OriginalMember(owner = "client!po", name = "M", descriptor = "I")
	public int anInt5753 = 0;

	@OriginalMember(owner = "client!po", name = "z", descriptor = "I")
	public final int anInt5743;

	@OriginalMember(owner = "client!po", name = "H", descriptor = "I")
	public final int anInt5748;

	@OriginalMember(owner = "client!po", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString56;

	@OriginalMember(owner = "client!po", name = "E", descriptor = "Ljava/lang/String;")
	public final String aString57;

	@OriginalMember(owner = "client!po", name = "C", descriptor = "Lclient!nj;")
	public final Class181 aClass181_30;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class2_Sub1_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt5745 = arg4;
		this.anInt5743 = arg0;
		this.anInt5748 = arg3;
		this.anInt5744 = arg6;
		this.aString56 = arg2;
		this.aString57 = arg1;
		this.aBoolean405 = arg5;
		if (this.anInt5744 == 255) {
			this.anInt5744 = 0;
		}
		this.aClass181_30 = new Class181();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIII[I)Z")
	public boolean method4552(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) Class2_Sub24 local11 = (Class2_Sub24) this.aClass181_30.method3972(); local11 != null; local11 = (Class2_Sub24) this.aClass181_30.method3975()) {
			if (local11.method2985(arg1, arg0, arg2)) {
				local11.method2987(arg3, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "([IIII)Z")
	public boolean method4554(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(19) Class2_Sub24 local19 = (Class2_Sub24) this.aClass181_30.method3972(); local19 != null; local19 = (Class2_Sub24) this.aClass181_30.method3975()) {
			if (local19.method2988(arg2, arg1)) {
				local19.method2986(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	public void method4555() {
		this.anInt5751 = 0;
		this.anInt5746 = 12800;
		this.anInt5741 = 12800;
		this.anInt5753 = 0;
		for (@Pc(31) Class2_Sub24 local31 = (Class2_Sub24) this.aClass181_30.method3972(); local31 != null; local31 = (Class2_Sub24) this.aClass181_30.method3975()) {
			if (this.anInt5751 < local31.anInt3618) {
				this.anInt5751 = local31.anInt3618;
			}
			if (this.anInt5741 > local31.anInt3614) {
				this.anInt5741 = local31.anInt3614;
			}
			if (this.anInt5746 > local31.anInt3609) {
				this.anInt5746 = local31.anInt3609;
			}
			if (this.anInt5753 < local31.anInt3620) {
				this.anInt5753 = local31.anInt3620;
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ZII)Z")
	public boolean method4557(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class2_Sub24 local11 = (Class2_Sub24) this.aClass181_30.method3972(); local11 != null; local11 = (Class2_Sub24) this.aClass181_30.method3975()) {
			if (local11.method2990(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BII[I)Z")
	public boolean method4558(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(11) Class2_Sub24 local11 = (Class2_Sub24) this.aClass181_30.method3972(); local11 != null; local11 = (Class2_Sub24) this.aClass181_30.method3975()) {
			if (local11.method2990(arg0, arg1)) {
				local11.method2987(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}
}
