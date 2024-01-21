import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VNWSQIXW")
public final class Class35 {

	@OriginalMember(owner = "client!VNWSQIXW", name = "c", descriptor = "I")
	private int anInt697;

	@OriginalMember(owner = "client!VNWSQIXW", name = "d", descriptor = "I")
	private int anInt698;

	@OriginalMember(owner = "client!VNWSQIXW", name = "a", descriptor = "I")
	private int anInt696 = 859;

	@OriginalMember(owner = "client!VNWSQIXW", name = "b", descriptor = "B")
	private byte aByte28 = 52;

	@OriginalMember(owner = "client!VNWSQIXW", name = "e", descriptor = "Lclient!OGGHOMII;")
	private Class3_Sub1 aClass3_Sub1_35 = new Class3_Sub1();

	@OriginalMember(owner = "client!VNWSQIXW", name = "i", descriptor = "Lclient!PNEYGONI;")
	private Class24 aClass24_1 = new Class24((byte) 33);

	@OriginalMember(owner = "client!VNWSQIXW", name = "f", descriptor = "I")
	private int anInt699;

	@OriginalMember(owner = "client!VNWSQIXW", name = "g", descriptor = "I")
	private int anInt700;

	@OriginalMember(owner = "client!VNWSQIXW", name = "h", descriptor = "Lclient!BELQMOFW;")
	private Class1 aClass1_1;

	@OriginalMember(owner = "client!VNWSQIXW", name = "<init>", descriptor = "(IB)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(23) boolean local23 = false;
			this.anInt699 = arg0;
			this.anInt700 = arg0;
			this.aClass1_1 = new Class1(this.aByte28, 1024);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("67265, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VNWSQIXW", name = "a", descriptor = "(J)Lclient!OGGHOMII;")
	public Class3_Sub1 method474(@OriginalArg(0) long arg0) {
		@Pc(5) Class3_Sub1 local5 = (Class3_Sub1) this.aClass1_1.method14(arg0);
		if (local5 == null) {
			this.anInt697++;
		} else {
			this.aClass24_1.method367(local5);
			this.anInt698++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!VNWSQIXW", name = "a", descriptor = "(IJLclient!OGGHOMII;)V")
	public void method475(@OriginalArg(1) long arg0, @OriginalArg(2) Class3_Sub1 arg1) {
		try {
			if (this.anInt700 == 0) {
				@Pc(6) Class3_Sub1 local6 = this.aClass24_1.method368();
				local6.method503();
				local6.method504();
				if (local6 == this.aClass3_Sub1_35) {
					local6 = this.aClass24_1.method368();
					local6.method503();
					local6.method504();
				}
			} else {
				this.anInt700--;
			}
			this.aClass1_1.method15(arg0, arg1);
			this.aClass24_1.method367(arg1);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("19970, " + 7 + ", " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VNWSQIXW", name = "a", descriptor = "()V")
	public void method476() {
		while (true) {
			@Pc(3) Class3_Sub1 local3 = this.aClass24_1.method368();
			if (local3 == null) {
				this.anInt700 = this.anInt699;
				return;
			}
			local3.method503();
			local3.method504();
		}
	}
}
