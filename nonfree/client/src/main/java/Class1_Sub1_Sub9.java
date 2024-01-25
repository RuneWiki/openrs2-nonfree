import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "Lclient!br;")
	private Class26 aClass26_9;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!eb;I)V")
	public void method1709(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method3141();
			if (local14 == 0) {
				return;
			}
			this.method1714(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIB)I")
	public int method1710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass26_9 == null) {
			return arg1;
		} else {
			@Pc(21) Class1_Sub37 local21 = (Class1_Sub37) this.aClass26_9.method870((long) arg0);
			return local21 == null ? arg1 : local21.anInt6000;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/String;IZ)Ljava/lang/String;")
	public String method1712(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass26_9 == null) {
			return arg0;
		} else {
			@Pc(21) Class1_Sub26 local21 = (Class1_Sub26) this.aClass26_9.method870((long) arg1);
			return local21 == null ? arg0 : local21.aString169;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BILclient!eb;)V")
	private void method1714(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(20) int local20 = arg1.method3141();
		@Pc(27) int local27;
		if (this.aClass26_9 == null) {
			local27 = Static339.method5608(local20);
			this.aClass26_9 = new Class26(local27);
		}
		for (local27 = 0; local27 < local20; local27++) {
			@Pc(48) boolean local48 = arg1.method3141() == 1;
			@Pc(52) int local52 = arg1.method3137();
			@Pc(61) Class1 local61;
			if (local48) {
				local61 = new Class1_Sub26(arg1.method3134());
			} else {
				local61 = new Class1_Sub37(arg1.method3125());
			}
			this.aClass26_9.method877((long) local52, local61);
		}
	}
}
