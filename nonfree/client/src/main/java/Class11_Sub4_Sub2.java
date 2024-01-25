import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class11_Sub4_Sub2 extends Class11_Sub4 {

	@OriginalMember(owner = "client!bk", name = "x", descriptor = "Lclient!ec;")
	private Class58 aClass58_4;

	static {
		new Class117("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;")
	public String method350(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass58_4 == null) {
			return arg0;
		} else {
			@Pc(21) Class11_Sub30 local21 = (Class11_Sub30) this.aClass58_4.method1009((long) arg1);
			return local21 == null ? arg0 : local21.aString43;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLclient!kh;)V")
	public void method352(@OriginalArg(1) Class11_Sub25 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5185();
			if (local14 == 0) {
				return;
			}
			this.method353(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!kh;B)V")
	private void method353(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub25 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(22) int local22 = arg1.method5185();
		@Pc(29) int local29;
		if (this.aClass58_4 == null) {
			local29 = Static90.method4097(local22);
			this.aClass58_4 = new Class58(local29);
		}
		for (local29 = 0; local29 < local22; local29++) {
			@Pc(48) boolean local48 = arg1.method5185() == 1;
			@Pc(52) int local52 = arg1.method5221();
			@Pc(61) Class11 local61;
			if (local48) {
				local61 = new Class11_Sub30(arg1.method5184());
			} else {
				local61 = new Class11_Sub33(arg1.method5198());
			}
			this.aClass58_4.method1006((long) local52, local61);
		}
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(III)I")
	public int method356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass58_4 == null) {
			return arg1;
		} else {
			@Pc(21) Class11_Sub33 local21 = (Class11_Sub33) this.aClass58_4.method1009((long) arg0);
			return local21 == null ? arg1 : local21.anInt5153;
		}
	}
}
