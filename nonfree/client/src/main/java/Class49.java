import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VSLUEINI")
public final class Class49 {

	@OriginalMember(owner = "client!VSLUEINI", name = "a", descriptor = "I")
	private static int anInt790;

	@OriginalMember(owner = "client!VSLUEINI", name = "b", descriptor = "[Lclient!VSLUEINI;")
	public static Class49[] aClass49Array1;

	@OriginalMember(owner = "client!VSLUEINI", name = "c", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!VSLUEINI", name = "d", descriptor = "I")
	public int anInt791;

	@OriginalMember(owner = "client!VSLUEINI", name = "e", descriptor = "I")
	public int anInt792;

	@OriginalMember(owner = "client!VSLUEINI", name = "f", descriptor = "I")
	public int anInt793;

	@OriginalMember(owner = "client!VSLUEINI", name = "i", descriptor = "I")
	private int anInt795;

	@OriginalMember(owner = "client!VSLUEINI", name = "g", descriptor = "Z")
	private boolean aBoolean170 = false;

	@OriginalMember(owner = "client!VSLUEINI", name = "h", descriptor = "I")
	private int anInt794 = -1;

	@OriginalMember(owner = "client!VSLUEINI", name = "a", descriptor = "(ILclient!QKFGLETG;)V")
	public static void method482(@OriginalArg(1) Class36 arg0) {
		try {
			@Pc(11) Class1_Sub1_Sub3 local11 = new Class1_Sub1_Sub3((byte) 9, arg0.method337("varbit.dat", null));
			anInt790 = local11.method500();
			if (aClass49Array1 == null) {
				aClass49Array1 = new Class49[anInt790];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt790; local21++) {
				if (aClass49Array1[local21] == null) {
					aClass49Array1[local21] = new Class49();
				}
				aClass49Array1[local21].method483(local11, local21);
				if (aClass49Array1[local21].aBoolean170) {
					Class30.aClass30Array1[aClass49Array1[local21].anInt791].aBoolean100 = true;
				}
			}
			if (local11.anInt806 != local11.aByteArray19.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("95244, " + 0 + ", " + arg0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSLUEINI", name = "<init>", descriptor = "()V")
	private Class49() {
	}

	@OriginalMember(owner = "client!VSLUEINI", name = "a", descriptor = "(Lclient!XJCNBMKS;II)V")
	private void method483(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			while (true) {
				@Pc(7) int local7 = arg0.method498();
				if (local7 == 0) {
					return;
				}
				if (local7 == 1) {
					this.anInt791 = arg0.method500();
					this.anInt792 = arg0.method498();
					this.anInt793 = arg0.method498();
				} else if (local7 == 10) {
					this.aString16 = arg0.method505();
				} else if (local7 == 2) {
					this.aBoolean170 = true;
				} else if (local7 == 3) {
					this.anInt794 = arg0.method503();
				} else if (local7 == 4) {
					this.anInt795 = arg0.method503();
				} else {
					System.out.println("Error unrecognised config code: " + local7);
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("8317, " + arg0 + ", " + arg1 + ", " + 857 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
