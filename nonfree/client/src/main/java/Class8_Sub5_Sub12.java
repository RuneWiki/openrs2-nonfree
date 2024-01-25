import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class8_Sub5_Sub12 extends Class8_Sub5 {

	@OriginalMember(owner = "client!mw", name = "z", descriptor = "Lclient!pfa;")
	private Class253 aClass253_25;

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method5579(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass253_25 == null) {
			return arg1;
		} else {
			@Pc(16) Class8_Sub28 local16 = (Class8_Sub28) this.aClass253_25.method6594((long) arg0);
			return local16 == null ? arg1 : local16.aString63;
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!ig;ZI)V")
	private void method5580(@OriginalArg(0) Class8_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(20) int local20 = arg0.method8525();
		@Pc(31) int local31;
		if (this.aClass253_25 == null) {
			local31 = Static629.method8469(local20);
			this.aClass253_25 = new Class253(local31);
		}
		for (local31 = 0; local31 < local20; local31++) {
			@Pc(50) boolean local50 = arg0.method8525() == 1;
			@Pc(54) int local54 = arg0.method8560();
			@Pc(63) Class8 local63;
			if (local50) {
				local63 = new Class8_Sub28(arg0.method8570());
			} else {
				local63 = new Class8_Sub17(arg0.method8540());
			}
			this.aClass253_25.method6591(local63, (long) local54);
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(III)I")
	public int method5581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass253_25 == null) {
			return arg0;
		} else {
			@Pc(16) Class8_Sub17 local16 = (Class8_Sub17) this.aClass253_25.method6594((long) arg1);
			return local16 == null ? arg0 : local16.anInt2919;
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!ig;I)V")
	public void method5582(@OriginalArg(0) Class8_Sub8 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8525();
			if (local13 == 0) {
				return;
			}
			this.method5580(arg0, local13);
		}
	}
}
