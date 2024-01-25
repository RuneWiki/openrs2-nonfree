import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!uq", name = "B", descriptor = "Z")
	public boolean aBoolean475 = true;

	@OriginalMember(owner = "client!uq", name = "z", descriptor = "I")
	public int anInt7417 = 12800;

	@OriginalMember(owner = "client!uq", name = "C", descriptor = "I")
	public int anInt7418 = 0;

	@OriginalMember(owner = "client!uq", name = "H", descriptor = "I")
	public int anInt7422 = -1;

	@OriginalMember(owner = "client!uq", name = "G", descriptor = "I")
	public int anInt7421 = -1;

	@OriginalMember(owner = "client!uq", name = "J", descriptor = "I")
	public int anInt7424 = 0;

	@OriginalMember(owner = "client!uq", name = "F", descriptor = "I")
	public int anInt7420 = 12800;

	@OriginalMember(owner = "client!uq", name = "N", descriptor = "I")
	public final int anInt7426;

	@OriginalMember(owner = "client!uq", name = "M", descriptor = "Ljava/lang/String;")
	public final String aString65;

	@OriginalMember(owner = "client!uq", name = "O", descriptor = "I")
	public final int anInt7427;

	@OriginalMember(owner = "client!uq", name = "E", descriptor = "Ljava/lang/String;")
	public final String aString64;

	@OriginalMember(owner = "client!uq", name = "L", descriptor = "Lclient!pu;")
	public final Class203 aClass203_48;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class1_Sub1_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt7422 = arg6;
		this.anInt7426 = arg3;
		this.anInt7421 = arg4;
		this.aBoolean475 = arg5;
		this.aString65 = arg1;
		this.anInt7427 = arg0;
		this.aString64 = arg2;
		if (this.anInt7422 == 255) {
			this.anInt7422 = 0;
		}
		this.aClass203_48 = new Class203();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZI[I)Z")
	public boolean method5647(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(18) Class1_Sub30 local18 = (Class1_Sub30) this.aClass203_48.method4548(); local18 != null; local18 = (Class1_Sub30) this.aClass203_48.method4545()) {
			if (local18.method4102(arg1, arg0)) {
				local18.method4100(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB[III)Z")
	public boolean method5649(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(9) Class1_Sub30 local9 = (Class1_Sub30) this.aClass203_48.method4548(); local9 != null; local9 = (Class1_Sub30) this.aClass203_48.method4545()) {
			if (local9.method4103(arg2, arg3, arg0)) {
				local9.method4097(arg1, arg3, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)Z")
	public boolean method5651(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(17) Class1_Sub30 local17 = (Class1_Sub30) this.aClass203_48.method4548(); local17 != null; local17 = (Class1_Sub30) this.aClass203_48.method4545()) {
			if (local17.method4101(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBI[I)Z")
	public boolean method5652(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(14) Class1_Sub30 local14 = (Class1_Sub30) this.aClass203_48.method4548(); local14 != null; local14 = (Class1_Sub30) this.aClass203_48.method4545()) {
			if (local14.method4101(arg0, arg1)) {
				local14.method4097(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(Z)V")
	public void method5654() {
		this.anInt7420 = 12800;
		this.anInt7417 = 12800;
		this.anInt7424 = 0;
		this.anInt7418 = 0;
		for (@Pc(28) Class1_Sub30 local28 = (Class1_Sub30) this.aClass203_48.method4548(); local28 != null; local28 = (Class1_Sub30) this.aClass203_48.method4545()) {
			if (local28.anInt5371 < this.anInt7417) {
				this.anInt7417 = local28.anInt5371;
			}
			if (local28.anInt5361 > this.anInt7424) {
				this.anInt7424 = local28.anInt5361;
			}
			if (local28.anInt5363 < this.anInt7420) {
				this.anInt7420 = local28.anInt5363;
			}
			if (this.anInt7418 < local28.anInt5359) {
				this.anInt7418 = local28.anInt5359;
			}
		}
	}
}
