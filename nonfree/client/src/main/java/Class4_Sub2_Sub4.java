import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class4_Sub2_Sub4 extends Class4_Sub2 {

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "Lclient!ek;")
	private Class67 aClass67_1;

	static {
		new Class15("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIB)I")
	public int method336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass67_1 == null) {
			return arg1;
		} else {
			@Pc(21) Class4_Sub24 local21 = (Class4_Sub24) this.aClass67_1.method1429((long) arg0);
			return local21 == null ? arg1 : local21.anInt4057;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!fh;IB)V")
	private void method338(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(21) int local21 = arg0.method5007();
		@Pc(30) int local30;
		if (this.aClass67_1 == null) {
			local30 = Static171.method2382(local21);
			this.aClass67_1 = new Class67(local30);
		}
		for (local30 = 0; local30 < local21; local30++) {
			@Pc(49) boolean local49 = arg0.method5007() == 1;
			@Pc(53) int local53 = arg0.method5008();
			@Pc(62) Class4 local62;
			if (local49) {
				local62 = new Class4_Sub38(arg0.method5038());
			} else {
				local62 = new Class4_Sub24(arg0.method4997());
			}
			this.aClass67_1.method1426(local62, (long) local53);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!fh;B)V")
	public void method339(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5007();
			if (local5 == 0) {
				return;
			}
			this.method338(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method340(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass67_1 == null) {
			return arg0;
		} else {
			@Pc(16) Class4_Sub38 local16 = (Class4_Sub38) this.aClass67_1.method1429((long) arg1);
			return local16 == null ? arg0 : local16.aString65;
		}
	}
}
