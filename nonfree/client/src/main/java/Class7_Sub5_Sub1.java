import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class7_Sub5_Sub1 extends Class7_Sub5 {

	@OriginalMember(owner = "client!um", name = "w", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!um", name = "A", descriptor = "I")
	public int anInt6743;

	@OriginalMember(owner = "client!um", name = "G", descriptor = "I")
	public int anInt6747;

	@OriginalMember(owner = "client!um", name = "J", descriptor = "I")
	public int anInt6749;

	@OriginalMember(owner = "client!um", name = "K", descriptor = "I")
	public int anInt6750;

	@OriginalMember(owner = "client!um", name = "u", descriptor = "I")
	public int anInt6738 = -1;

	@OriginalMember(owner = "client!um", name = "v", descriptor = "I")
	public int anInt6739 = -1;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray1[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZLclient!qa;)Lclient!ae;")
	@Override
	public Class6_Sub1 method5274(@OriginalArg(1) Class172 arg0) {
		@Pc(6) Class107 local6 = arg0.method5495();
		local6.R(super.anInt6729, super.anInt6732, super.anInt6731);
		@Pc(18) Class6_Sub1 local18 = Static43.method829(3);
		@Pc(40) Class9 local40;
		if (this.anInt6738 != -1) {
			local40 = Static314.aClass12_2.method327(this.anInt6738).method1942(0, this.anInt6747, null, null, -1, 0, 2048, arg0);
			if (local40 != null) {
				local40.method5695(local6, local18.aClass6_Sub5Array1[2], 0);
			}
		}
		if (this.anInt6739 != -1) {
			local40 = Static314.aClass12_2.method327(this.anInt6739).method1942(0, this.anInt6743, null, null, -1, 0, 2048, arg0);
			if (local40 != null) {
				local40.method5695(local6, local18.aClass6_Sub5Array1[1], 0);
			}
		}
		local40 = Static314.aClass12_2.method327(this.anInt6750).method1942(0, this.anInt6749, null, null, -1, 0, 2048, arg0);
		if (local40 != null) {
			local40.method5695(local6, local18.aClass6_Sub5Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method5270(@OriginalArg(1) Class172 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class107 local6 = arg0.method5495();
		local6.R(super.anInt6729, super.anInt6732, super.anInt6731);
		@Pc(31) Class9 local31 = Static314.aClass12_2.method327(this.anInt6750).method1942(0, this.anInt6749, null, null, -1, 0, 131072, arg0);
		if (local31 != null && local31.method5693(arg2, arg1, local6, true)) {
			return true;
		}
		if (this.anInt6739 != -1) {
			local31 = Static314.aClass12_2.method327(this.anInt6739).method1942(0, this.anInt6743, null, null, -1, 0, 131072, arg0);
			if (local31 != null && local31.method5693(arg2, arg1, local6, true)) {
				return true;
			}
		}
		if (this.anInt6738 != -1) {
			local31 = Static314.aClass12_2.method327(this.anInt6738).method1942(0, this.anInt6747, null, null, -1, 0, 131072, arg0);
			if (local31 != null && local31.method5693(arg2, arg1, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5267(@OriginalArg(1) Class172 arg0) {
	}
}
