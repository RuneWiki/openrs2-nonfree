import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LXKBDSHJ")
public final class Class25 {

	@OriginalMember(owner = "client!LXKBDSHJ", name = "c", descriptor = "I")
	private int anInt447;

	@OriginalMember(owner = "client!LXKBDSHJ", name = "d", descriptor = "I")
	private int anInt448;

	@OriginalMember(owner = "client!LXKBDSHJ", name = "a", descriptor = "I")
	private int anInt446 = 252;

	@OriginalMember(owner = "client!LXKBDSHJ", name = "b", descriptor = "B")
	private byte aByte13 = 0;

	@OriginalMember(owner = "client!LXKBDSHJ", name = "e", descriptor = "Lclient!KGLULAMW;")
	private Class2_Sub1 aClass2_Sub1_27 = new Class2_Sub1();

	@OriginalMember(owner = "client!LXKBDSHJ", name = "i", descriptor = "Lclient!LXCATFEF;")
	private Class24 aClass24_2 = new Class24(512);

	@OriginalMember(owner = "client!LXKBDSHJ", name = "f", descriptor = "I")
	private int anInt449;

	@OriginalMember(owner = "client!LXKBDSHJ", name = "g", descriptor = "I")
	private int anInt450;

	@OriginalMember(owner = "client!LXKBDSHJ", name = "h", descriptor = "Lclient!WGMBOAQO;")
	private Class45 aClass45_1;

	@OriginalMember(owner = "client!LXKBDSHJ", name = "<init>", descriptor = "(BI)V")
	public Class25(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt449 = arg1;
			if (arg0 == this.aByte13) {
				@Pc(27) boolean local27 = false;
			} else {
				this.anInt446 = -340;
			}
			this.anInt450 = arg1;
			this.aClass45_1 = new Class45((byte) 45, 1024);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("98187, " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LXKBDSHJ", name = "a", descriptor = "(J)Lclient!KGLULAMW;")
	public Class2_Sub1 method347(@OriginalArg(0) long arg0) {
		@Pc(5) Class2_Sub1 local5 = (Class2_Sub1) this.aClass45_1.method549(arg0);
		if (local5 == null) {
			this.anInt447++;
		} else {
			this.aClass24_2.method342(local5);
			this.anInt448++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!LXKBDSHJ", name = "a", descriptor = "(ILclient!KGLULAMW;J)V")
	public void method348(@OriginalArg(1) Class2_Sub1 arg0, @OriginalArg(2) long arg1) {
		try {
			if (this.anInt450 == 0) {
				@Pc(8) Class2_Sub1 local8 = this.aClass24_2.method343();
				local8.method562();
				local8.method563();
				if (local8 == this.aClass2_Sub1_27) {
					local8 = this.aClass24_2.method343();
					local8.method562();
					local8.method563();
				}
			} else {
				this.anInt450--;
			}
			this.aClass45_1.method550(arg1, (byte) 3, arg0);
			this.aClass24_2.method342(arg0);
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("3855, " + -681 + ", " + arg0 + ", " + arg1 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LXKBDSHJ", name = "a", descriptor = "()V")
	public void method349() {
		while (true) {
			@Pc(3) Class2_Sub1 local3 = this.aClass24_2.method343();
			if (local3 == null) {
				this.anInt450 = this.anInt449;
				return;
			}
			local3.method562();
			local3.method563();
		}
	}
}
