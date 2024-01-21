import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JGECYJMS")
public final class Class15 {

	@OriginalMember(owner = "client!JGECYJMS", name = "c", descriptor = "I")
	private int anInt265;

	@OriginalMember(owner = "client!JGECYJMS", name = "d", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!JGECYJMS", name = "a", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!JGECYJMS", name = "b", descriptor = "Z")
	private boolean aBoolean55 = true;

	@OriginalMember(owner = "client!JGECYJMS", name = "e", descriptor = "Lclient!USMRNXZO;")
	private Class8_Sub1 aClass8_Sub1_13 = new Class8_Sub1();

	@OriginalMember(owner = "client!JGECYJMS", name = "i", descriptor = "Lclient!JLOKOMHZ;")
	private Class16 aClass16_2 = new Class16(-46779);

	@OriginalMember(owner = "client!JGECYJMS", name = "f", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!JGECYJMS", name = "g", descriptor = "I")
	private int anInt268;

	@OriginalMember(owner = "client!JGECYJMS", name = "h", descriptor = "Lclient!YFWIPPMU;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!JGECYJMS", name = "<init>", descriptor = "(II)V")
	public Class15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt267 = arg0;
			this.anInt268 = arg0;
			this.aClass47_1 = new Class47(1024, (byte) 6);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("69501, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JGECYJMS", name = "a", descriptor = "(J)Lclient!USMRNXZO;")
	public Class8_Sub1 method116(@OriginalArg(0) long arg0) {
		@Pc(5) Class8_Sub1 local5 = (Class8_Sub1) this.aClass47_1.method539(arg0);
		if (local5 == null) {
			this.anInt265++;
		} else {
			this.aClass16_2.method119(local5);
			this.anInt266++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!JGECYJMS", name = "a", descriptor = "(JILclient!USMRNXZO;)V")
	public void method117(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8_Sub1 arg2) {
		try {
			@Pc(5) boolean local5 = false;
			if (this.anInt268 == 0) {
				@Pc(12) Class8_Sub1 local12 = this.aClass16_2.method120();
				local12.method546();
				local12.method547();
				if (local12 == this.aClass8_Sub1_13) {
					local12 = this.aClass16_2.method120();
					local12.method546();
					local12.method547();
				}
			} else {
				this.anInt268--;
			}
			this.aClass47_1.method540(arg0, arg2);
			this.aClass16_2.method119(arg2);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("89358, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JGECYJMS", name = "a", descriptor = "()V")
	public void method118() {
		while (true) {
			@Pc(3) Class8_Sub1 local3 = this.aClass16_2.method120();
			if (local3 == null) {
				this.anInt268 = this.anInt267;
				return;
			}
			local3.method546();
			local3.method547();
		}
	}
}
