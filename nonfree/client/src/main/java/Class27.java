import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class27 {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
	public int anInt1341;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
	public int anInt1342;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
	public int anInt1344;

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
	private int anInt1345;

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
	private int anInt1346;

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
	private int anInt1347;

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
	private int anInt1348;

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
	private int anInt1349;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
	private int anInt1343 = 2;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "[I")
	private int[] anIntArray86 = new int[2];

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "[I")
	private int[] anIntArray85 = new int[2];

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class27() {
		this.anIntArray86[0] = 0;
		this.anIntArray86[1] = 65535;
		this.anIntArray85[0] = 0;
		this.anIntArray85[1] = 65535;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!b;)V")
	public void method866(@OriginalArg(0) Class6_Sub1 arg0) {
		this.anInt1344 = arg0.method1495();
		this.anInt1341 = arg0.method1503();
		this.anInt1342 = arg0.method1503();
		this.method869(arg0);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "()V")
	public void method867() {
		this.anInt1347 = 0;
		this.anInt1349 = 0;
		this.anInt1345 = 0;
		this.anInt1346 = 0;
		this.anInt1348 = 0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)I")
	public int method868(@OriginalArg(0) int arg0) {
		if (this.anInt1348 >= this.anInt1347) {
			this.anInt1346 = this.anIntArray85[this.anInt1349++] << 15;
			if (this.anInt1349 >= this.anInt1343) {
				this.anInt1349 = this.anInt1343 - 1;
			}
			this.anInt1347 = (int) ((double) this.anIntArray86[this.anInt1349] / 65536.0D * (double) arg0);
			if (this.anInt1347 > this.anInt1348) {
				this.anInt1345 = ((this.anIntArray85[this.anInt1349] << 15) - this.anInt1346) / (this.anInt1347 - this.anInt1348);
			}
		}
		this.anInt1346 += this.anInt1345;
		this.anInt1348++;
		return this.anInt1346 - this.anInt1345 >> 15;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Lclient!b;)V")
	public void method869(@OriginalArg(0) Class6_Sub1 arg0) {
		this.anInt1343 = arg0.method1495();
		this.anIntArray86 = new int[this.anInt1343];
		this.anIntArray85 = new int[this.anInt1343];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1343; local16++) {
			this.anIntArray86[local16] = arg0.method1500();
			this.anIntArray85[local16] = arg0.method1500();
		}
	}
}
