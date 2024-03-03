import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public final class Class2_Sub35 extends Class2 {

	@OriginalMember(owner = "client!sm", name = "t", descriptor = "Lclient!bc;")
	public static final Class16 aClass16_8 = new Class16("", 13);

	@OriginalMember(owner = "client!sm", name = "w", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!sm", name = "z", descriptor = "I")
	public static int anInt5994 = 0;

	@OriginalMember(owner = "client!sm", name = "y", descriptor = "I")
	public static int anInt5993 = 0;

	@OriginalMember(owner = "client!sm", name = "B", descriptor = "Lclient!h;")
	public static final Class89 aClass89_214;

	@OriginalMember(owner = "client!sm", name = "x", descriptor = "J")
	public long aLong183;

	static {
		new Class79("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
		aClass89_214 = new Class89(93, 5);
	}

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V", line = 55)
	private Class2_Sub35() {
	}

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(J)V", line = 57)
	public Class2_Sub35(@OriginalArg(0) long arg0) {
		this.aLong183 = arg0;
	}
}
