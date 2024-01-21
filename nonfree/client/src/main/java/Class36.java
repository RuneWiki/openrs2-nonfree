import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QXKQGEKL")
public final class Class36 {

	@OriginalMember(owner = "client!QXKQGEKL", name = "d", descriptor = "I")
	private int anInt693;

	@OriginalMember(owner = "client!QXKQGEKL", name = "e", descriptor = "I")
	private int anInt694;

	@OriginalMember(owner = "client!QXKQGEKL", name = "a", descriptor = "I")
	private int anInt691 = 4;

	@OriginalMember(owner = "client!QXKQGEKL", name = "b", descriptor = "I")
	private int anInt692 = 48306;

	@OriginalMember(owner = "client!QXKQGEKL", name = "c", descriptor = "Z")
	private boolean aBoolean174 = true;

	@OriginalMember(owner = "client!QXKQGEKL", name = "f", descriptor = "Lclient!PFQOGDTY;")
	private Class6_Sub1 aClass6_Sub1_31 = new Class6_Sub1();

	@OriginalMember(owner = "client!QXKQGEKL", name = "j", descriptor = "Lclient!LIHZBJAU;")
	private Class24 aClass24_2 = new Class24(0);

	@OriginalMember(owner = "client!QXKQGEKL", name = "g", descriptor = "I")
	private int anInt695;

	@OriginalMember(owner = "client!QXKQGEKL", name = "h", descriptor = "I")
	private int anInt696;

	@OriginalMember(owner = "client!QXKQGEKL", name = "i", descriptor = "Lclient!SMFBSJJD;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!QXKQGEKL", name = "<init>", descriptor = "(II)V")
	public Class36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt695 = arg0;
			this.anInt696 = arg0;
			this.aClass39_1 = new Class39(this.anInt691, 1024);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("13830, " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QXKQGEKL", name = "a", descriptor = "(J)Lclient!PFQOGDTY;")
	public Class6_Sub1 method394(@OriginalArg(0) long arg0) {
		@Pc(5) Class6_Sub1 local5 = (Class6_Sub1) this.aClass39_1.method459(arg0);
		if (local5 == null) {
			this.anInt693++;
		} else {
			this.aClass24_2.method185(local5);
			this.anInt694++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!QXKQGEKL", name = "a", descriptor = "(JLclient!PFQOGDTY;I)V")
	public void method395(@OriginalArg(0) long arg0, @OriginalArg(1) Class6_Sub1 arg1) {
		try {
			if (this.anInt696 == 0) {
				@Pc(13) Class6_Sub1 local13 = this.aClass24_2.method186();
				local13.method548();
				local13.method549();
				if (local13 == this.aClass6_Sub1_31) {
					local13 = this.aClass24_2.method186();
					local13.method548();
					local13.method549();
				}
			} else {
				this.anInt696--;
			}
			this.aClass39_1.method460(arg0, arg1);
			this.aClass24_2.method185(arg1);
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("17253, " + arg0 + ", " + arg1 + ", " + -501 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QXKQGEKL", name = "a", descriptor = "()V")
	public void method396() {
		while (true) {
			@Pc(3) Class6_Sub1 local3 = this.aClass24_2.method186();
			if (local3 == null) {
				this.anInt696 = this.anInt695;
				return;
			}
			local3.method548();
			local3.method549();
		}
	}
}
