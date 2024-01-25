import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class4_Sub4_Sub11 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ne", name = "G", descriptor = "Z")
	public boolean aBoolean335 = true;

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
	public int anInt4348 = 12800;

	@OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
	public int anInt4355 = -1;

	@OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
	public int anInt4352 = -1;

	@OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
	public int anInt4354 = 0;

	@OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
	public int anInt4360 = 0;

	@OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
	public int anInt4359 = 12800;

	@OriginalMember(owner = "client!ne", name = "F", descriptor = "Ljava/lang/String;")
	public final String aString49;

	@OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
	public final int anInt4357;

	@OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
	public final int anInt4353;

	@OriginalMember(owner = "client!ne", name = "L", descriptor = "Ljava/lang/String;")
	public final String aString50;

	@OriginalMember(owner = "client!ne", name = "N", descriptor = "Lclient!kn;")
	public final Class116 aClass116_37;

	static {
		new Class159("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class4_Sub4_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aBoolean335 = arg5;
		this.aString49 = arg1;
		this.anInt4357 = arg3;
		this.anInt4352 = arg4;
		this.anInt4355 = arg6;
		this.anInt4353 = arg0;
		this.aString50 = arg2;
		if (this.anInt4355 == 255) {
			this.anInt4355 = 0;
		}
		this.aClass116_37 = new Class116();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B[IIII)Z")
	public boolean method3892(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) Class4_Sub42 local16 = (Class4_Sub42) this.aClass116_37.method3270(); local16 != null; local16 = (Class4_Sub42) this.aClass116_37.method3272()) {
			if (local16.method5260(arg3, arg2, arg1)) {
				local16.method5259(arg1, arg0, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[IIB)Z")
	public boolean method3893(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) Class4_Sub42 local11 = (Class4_Sub42) this.aClass116_37.method3270(); local11 != null; local11 = (Class4_Sub42) this.aClass116_37.method3272()) {
			if (local11.method5258(arg0, arg2)) {
				local11.method5261(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIB)Z")
	public boolean method3894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) Class4_Sub42 local11 = (Class4_Sub42) this.aClass116_37.method3270(); local11 != null; local11 = (Class4_Sub42) this.aClass116_37.method3272()) {
			if (local11.method5262(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)V")
	public void method3897() {
		this.anInt4359 = 12800;
		this.anInt4354 = 0;
		this.anInt4348 = 12800;
		this.anInt4360 = 0;
		for (@Pc(23) Class4_Sub42 local23 = (Class4_Sub42) this.aClass116_37.method3270(); local23 != null; local23 = (Class4_Sub42) this.aClass116_37.method3272()) {
			if (this.anInt4354 < local23.anInt6190) {
				this.anInt4354 = local23.anInt6190;
			}
			if (this.anInt4359 > local23.anInt6199) {
				this.anInt4359 = local23.anInt6199;
			}
			if (this.anInt4360 < local23.anInt6204) {
				this.anInt4360 = local23.anInt6204;
			}
			if (this.anInt4348 > local23.anInt6194) {
				this.anInt4348 = local23.anInt6194;
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III[I)Z")
	public boolean method3899(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(11) Class4_Sub42 local11 = (Class4_Sub42) this.aClass116_37.method3270(); local11 != null; local11 = (Class4_Sub42) this.aClass116_37.method3272()) {
			if (local11.method5262(arg1, arg0)) {
				local11.method5259(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}
}
