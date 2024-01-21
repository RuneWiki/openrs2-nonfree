import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HARAZQMH")
public final class Class15 {

	@OriginalMember(owner = "client!HARAZQMH", name = "b", descriptor = "I")
	private int anInt175;

	@OriginalMember(owner = "client!HARAZQMH", name = "c", descriptor = "I")
	private int anInt176;

	@OriginalMember(owner = "client!HARAZQMH", name = "a", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!HARAZQMH", name = "d", descriptor = "Lclient!IOXDUYYH;")
	private Class1_Sub1 aClass1_Sub1_17 = new Class1_Sub1();

	@OriginalMember(owner = "client!HARAZQMH", name = "h", descriptor = "Lclient!ABNYIQPF;")
	private Class2 aClass2_1 = new Class2(8);

	@OriginalMember(owner = "client!HARAZQMH", name = "e", descriptor = "I")
	private int anInt177;

	@OriginalMember(owner = "client!HARAZQMH", name = "f", descriptor = "I")
	private int anInt178;

	@OriginalMember(owner = "client!HARAZQMH", name = "g", descriptor = "Lclient!JVZXLCGT;")
	private Class22 aClass22_1;

	@OriginalMember(owner = "client!HARAZQMH", name = "<init>", descriptor = "(BI)V")
	public Class15(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt177 = arg1;
			@Pc(23) boolean local23 = false;
			this.anInt178 = arg1;
			this.aClass22_1 = new Class22((byte) 108, 1024);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("57964, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HARAZQMH", name = "a", descriptor = "(J)Lclient!IOXDUYYH;")
	public Class1_Sub1 method182(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass22_1.method243(arg0);
		if (local5 == null) {
			this.anInt175++;
		} else {
			this.aClass2_1.method2(local5);
			this.anInt176++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!HARAZQMH", name = "a", descriptor = "(BJLclient!IOXDUYYH;)V")
	public void method183(@OriginalArg(1) long arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		try {
			if (this.anInt178 == 0) {
				@Pc(10) Class1_Sub1 local10 = this.aClass2_1.method3();
				local10.method552();
				local10.method553();
				if (local10 == this.aClass1_Sub1_17) {
					local10 = this.aClass2_1.method3();
					local10.method552();
					local10.method553();
				}
			} else {
				this.anInt178--;
			}
			this.aClass22_1.method244(arg1, arg0);
			this.aClass2_1.method2(arg1);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("92251, " + 24 + ", " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HARAZQMH", name = "a", descriptor = "()V")
	public void method184() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass2_1.method3();
			if (local3 == null) {
				this.anInt178 = this.anInt177;
				return;
			}
			local3.method552();
			local3.method553();
		}
	}
}
