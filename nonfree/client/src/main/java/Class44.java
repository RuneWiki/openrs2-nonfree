import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class44 {

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "Lclient!sq;")
	private Class1_Sub4 aClass1_Sub4_21 = new Class1_Sub4();

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "Lclient!ig;")
	private final Class89 aClass89_2 = new Class89();

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
	private final int anInt1668;

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
	private int anInt1667;

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "Lclient!dq;")
	private final Class38 aClass38_7;

	static {
		new Class106("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(I)V")
	public Class44(@OriginalArg(0) int arg0) {
		this.anInt1668 = arg0;
		this.anInt1667 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass38_7 = new Class38(local19);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(JI)Lclient!sq;")
	public Class1_Sub4 method1612(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub4 local10 = (Class1_Sub4) this.aClass38_7.method1475(arg0);
		if (local10 != null) {
			this.aClass89_2.method2720(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
	public void method1614() {
		this.aClass89_2.method2723();
		this.aClass38_7.method1466();
		this.aClass1_Sub4_21 = new Class1_Sub4();
		this.anInt1667 = this.anInt1668;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IJLclient!sq;)V")
	public void method1616(@OriginalArg(1) long arg0, @OriginalArg(2) Class1_Sub4 arg1) {
		if (this.anInt1667 == 0) {
			@Pc(27) Class1_Sub4 local27 = this.aClass89_2.method2722();
			local27.method6045();
			local27.method5714();
			if (local27 == this.aClass1_Sub4_21) {
				local27 = this.aClass89_2.method2722();
				local27.method6045();
				local27.method5714();
			}
		} else {
			this.anInt1667--;
		}
		this.aClass38_7.method1472(arg1, arg0);
		this.aClass89_2.method2720(arg1);
	}
}
