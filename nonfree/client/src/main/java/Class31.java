import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class31 {

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "Lclient!aq;")
	public Interface1 anInterface1_1 = null;

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "[Lclient!qaa;")
	public Interface14[] anInterface14Array2 = null;

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "[Lclient!qaa;")
	private Interface14[] anInterface14Array1 = null;

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "Z")
	public boolean aBoolean84;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!fc;)V")
	public Class31(@OriginalArg(0) Class15_Sub2 arg0) {
		this.aBoolean84 = arg0.aBoolean555;
		if (this.aBoolean84 && !arg0.method5374(Static249.aClass261_8, Static302.aClass200_11)) {
			this.aBoolean84 = false;
		}
		if (this.aBoolean84 || arg0.method5443(Static249.aClass261_8, Static302.aClass200_11)) {
			Static25.method907();
			if (this.aBoolean84) {
				@Pc(117) byte[] local117 = Static135.method2792(false, Static489.anObject16);
				this.anInterface1_1 = arg0.method5369(local117, Static249.aClass261_8);
				@Pc(132) byte[] local132 = Static135.method2792(false, Static337.anObject13);
				arg0.method5369(local132, Static249.aClass261_8);
			} else {
				this.anInterface14Array2 = new Interface14[16];
				for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
					@Pc(58) byte[] local58 = Static504.method7606(Static489.anObject16, local47 * 16384 * 2);
					this.anInterface14Array2[local47] = arg0.method5484(128, local58, true, 128, Static249.aClass261_8);
				}
				this.anInterface14Array1 = new Interface14[16];
				for (@Pc(82) int local82 = 0; local82 < 16; local82++) {
					@Pc(93) byte[] local93 = Static504.method7606(Static337.anObject13, local82 * 128 * 256);
					this.anInterface14Array1[local82] = arg0.method5484(128, local93, true, 128, Static249.aClass261_8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)Z")
	public boolean method1147() {
		if (this.aBoolean84) {
			return this.anInterface1_1 != null;
		} else {
			return this.anInterface14Array2 != null;
		}
	}
}
