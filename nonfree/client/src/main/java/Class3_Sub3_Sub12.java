import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class3_Sub3_Sub12 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "Lclient!gj;")
	private Class40 aClass40_4;

	@OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
	private int anInt1381;

	@OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
	public int anInt1386;

	@OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
	public int anInt1388;

	@OriginalMember(owner = "client!ge", name = "V", descriptor = "Lclient!oc;")
	private Class70 aClass70_654 = Static146.aClass70_1400;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)Lclient!oc;")
	public Class70 method1002(@OriginalArg(1) int arg0) {
		if (this.aClass40_4 == null) {
			return this.aClass70_654;
		} else {
			@Pc(19) Class3_Sub5 local19 = (Class3_Sub5) this.aClass40_4.method1029((long) arg0);
			return local19 == null ? this.aClass70_654 : local19.aClass70_281;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILclient!ce;)V")
	private void method1004(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt1386 = arg1.method1278();
		} else if (arg0 == 2) {
			this.anInt1388 = arg1.method1278();
		} else if (arg0 == 3) {
			this.aClass70_654 = arg1.method1246();
		} else if (arg0 == 4) {
			this.anInt1381 = arg1.method1245();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(35) int local35 = arg1.method1270();
			this.aClass40_4 = new Class40(Static91.method1315(local35));
			for (@Pc(45) int local45 = 0; local45 < local35; local45++) {
				@Pc(50) int local50 = arg1.method1245();
				@Pc(60) Class3 local60;
				if (arg0 == 5) {
					local60 = new Class3_Sub5(arg1.method1246());
				} else {
					local60 = new Class3_Sub16(arg1.method1245());
				}
				this.aClass40_4.method1027(local60, (long) local50);
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)I")
	public int method1006(@OriginalArg(1) int arg0) {
		if (this.aClass40_4 == null) {
			return this.anInt1381;
		} else {
			@Pc(17) Class3_Sub16 local17 = (Class3_Sub16) this.aClass40_4.method1029((long) arg0);
			return local17 == null ? this.anInt1381 : local17.anInt2100;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ce;I)V")
	public void method1007(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1278();
			if (local3 == 0) {
				return;
			}
			this.method1004(local3, arg0);
		}
	}
}
