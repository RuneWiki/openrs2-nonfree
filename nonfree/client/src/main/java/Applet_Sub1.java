import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!passwordapp")
public final class Applet_Sub1 extends Applet implements ActionListener, KeyListener, TextListener, Runnable {

	@OriginalMember(owner = "client!passwordapp", name = "allowedlist", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray1 = new String[] { "http://recovery_questions.runescape.com/", "http://webtestwip1.runescape.com:16304/", "http://webtestrc1.runescape.com:16304/", "http://local.runescape.com:16304/" };

	@OriginalMember(owner = "client!passwordapp", name = "codebase", descriptor = "Ljava/lang/String;")
	private String aString1;

	@OriginalMember(owner = "client!passwordapp", name = "norecovcheck", descriptor = "Ljava/awt/Checkbox;")
	private Checkbox aCheckbox1;

	@OriginalMember(owner = "client!passwordapp", name = "password1", descriptor = "Ljava/awt/TextField;")
	private TextField aTextField1;

	@OriginalMember(owner = "client!passwordapp", name = "onreversepath", descriptor = "Z")
	private boolean aBoolean1;

	@OriginalMember(owner = "client!passwordapp", name = "hidepanel", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel1;

	@OriginalMember(owner = "client!passwordapp", name = "showpanel", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel2;

	@OriginalMember(owner = "client!passwordapp", name = "type", descriptor = "I")
	private int anInt5;

	@OriginalMember(owner = "client!passwordapp", name = "username", descriptor = "Ljava/lang/String;")
	private String aString2;

	@OriginalMember(owner = "client!passwordapp", name = "uid", descriptor = "I")
	private int anInt6;

	@OriginalMember(owner = "client!passwordapp", name = "processingpage", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel3;

	@OriginalMember(owner = "client!passwordapp", name = "system_error_page", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel4;

	@OriginalMember(owner = "client!passwordapp", name = "blocked_query_page", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel5;

	@OriginalMember(owner = "client!passwordapp", name = "blocked_attack_page", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel6;

	@OriginalMember(owner = "client!passwordapp", name = "wrongpassword_page", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel7;

	@OriginalMember(owner = "client!passwordapp", name = "change_questions_success_page_active", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel8;

	@OriginalMember(owner = "client!passwordapp", name = "change_questions_success_page_pending", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel9;

	@OriginalMember(owner = "client!passwordapp", name = "change_questions_tooshort_page", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel10;

	@OriginalMember(owner = "client!passwordapp", name = "change_questions_samequestions_page", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel11;

	@OriginalMember(owner = "client!passwordapp", name = "change_questions_sameanswers_page", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel12;

	@OriginalMember(owner = "client!passwordapp", name = "change_questions_qandamatch_page", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel13;

	@OriginalMember(owner = "client!passwordapp", name = "change_questions_page", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel14;

	@OriginalMember(owner = "client!passwordapp", name = "question", descriptor = "[Ljava/awt/TextField;")
	private TextField[] aTextFieldArray1;

	@OriginalMember(owner = "client!passwordapp", name = "recov", descriptor = "[Ljava/awt/TextField;")
	private TextField[] aTextFieldArray2;

	@OriginalMember(owner = "client!passwordapp", name = "key_e", descriptor = "Ljava/math/BigInteger;")
	private BigInteger aBigInteger1;

	@OriginalMember(owner = "client!passwordapp", name = "key_n", descriptor = "Ljava/math/BigInteger;")
	private BigInteger aBigInteger2;

	@OriginalMember(owner = "client!passwordapp", name = "example_questions", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2;

	@OriginalMember(owner = "client!passwordapp", name = "initialised", descriptor = "Z")
	private boolean aBoolean2;

	@OriginalMember(owner = "client!passwordapp", name = "debug", descriptor = "Z")
	private boolean aBoolean3;

	@OriginalMember(owner = "client!passwordapp", name = "init", descriptor = "()V", line = 69)
	@Override
	public void init() {
		System.out.println("Version: 3");
		@Pc(7) Thread local7 = new Thread(this);
		local7.setDaemon(true);
		local7.start();
	}

	@OriginalMember(owner = "client!passwordapp", name = "init_messages", descriptor = "()V", line = 76)
	private void method38() {
		this.aPanel3 = new Panel(null);
		this.aPanel3.setSize(this.getSize());
		@Pc(22) Label local22 = this.method40("Processing Request", 180, this.getSize().height / 2 - 10);
		local22.setFont(new Font("Arial", 1, 13));
		this.aPanel3.add(local22);
		this.aPanel3.setVisible(false);
		this.add(this.aPanel3);
		@Pc(52) int local52 = this.getSize().height / 2 - 50;
		this.aPanel4 = new Panel(null);
		this.aPanel4.setSize(this.getSize());
		@Pc(69) Label local69 = this.method40("Error Processing Request", 165, local52);
		local69.setFont(new Font("Arial", 1, 13));
		this.aPanel4.add(local69);
		this.aPanel4.add(this.method40("Sorry, there was an error processing your request.", 100, local52 + 30));
		this.aPanel4.add(this.method40("Please try again later.", 180, local52 + 50));
		@Pc(109) Button local109 = new Button("Go back and try again");
		local109.setBounds(150, local52 + 80, 200, 22);
		local109.addActionListener(this);
		this.aPanel4.add(local109);
		this.aPanel4.setVisible(false);
		this.add(this.aPanel4);
		this.aPanel5 = new Panel(null);
		this.aPanel5.setSize(this.getSize());
		this.aPanel5.add(this.method40("Due to continued problems with this account, we are no longer", 80, this.getSize().height / 2 - 20));
		this.aPanel5.add(this.method40("accepting password support requests for it.", 80, this.getSize().height / 2));
		this.aPanel5.setVisible(false);
		this.add(this.aPanel5);
		this.aPanel6 = new Panel(null);
		this.aPanel6.setSize(this.getSize());
		this.aPanel6.add(this.method40("Due to repeated attempts at password recovery from your ip", 80, this.getSize().height / 2 - 20));
		this.aPanel6.add(this.method40("your request has been denied. Please try again later.", 80, this.getSize().height / 2));
		this.aPanel6.setVisible(false);
		this.add(this.aPanel6);
		@Pc(238) int local238 = this.getSize().height / 2 - 20;
		this.aPanel7 = new Panel(null);
		this.aPanel7.setSize(this.getSize());
		this.aPanel7.add(this.method40("You entered your existing password incorrectly.", 110, local238));
		this.aPanel7.setVisible(false);
		@Pc(267) Button local267 = new Button("Go Back");
		local267.setBounds(150, local238 + 30, 200, 22);
		local267.addActionListener(this);
		this.aPanel7.add(local267);
		this.add(this.aPanel7);
		this.aPanel8 = new Panel(null);
		this.aPanel8.setSize(this.getSize());
		this.aPanel8.add(this.method40("Your Recovery Questions and Answers have been successfully updated", 30, this.getSize().height / 2 - 10));
		this.aPanel8.add(this.method40("and are now active.", 30, this.getSize().height / 2 + 10));
		this.aPanel8.setVisible(false);
		this.add(this.aPanel8);
		this.aPanel9 = new Panel(null);
		this.aPanel9.setSize(this.getSize());
		this.aPanel9.add(this.method40("Your Recovery Questions and Answers have been successfully set", 30, this.getSize().height / 2 - 10));
		this.aPanel9.add(this.method40("and are pending. They will become active in 14 days.", 30, this.getSize().height / 2 + 10));
		this.aPanel9.setVisible(false);
		this.add(this.aPanel9);
		this.aPanel10 = new Panel(null);
		this.aPanel10.setSize(this.getSize());
		this.aPanel10.add(this.method40("One or more of the questions or answers", 130, 200));
		this.aPanel10.add(this.method40("that you gave was too short or empty.", 140, 220));
		this.aPanel10.setVisible(false);
		@Pc(426) Button local426 = new Button("Go Back");
		local426.setBounds(150, 250, 200, 22);
		local426.addActionListener(this);
		this.aPanel10.add(local426);
		this.add(this.aPanel10);
		this.aPanel11 = new Panel(null);
		this.aPanel11.setSize(this.getSize());
		this.aPanel11.add(this.method40("Two or more of the questions you entered were", 120, 200));
		this.aPanel11.add(this.method40("the same. All questions must be different.", 130, 220));
		this.aPanel11.setVisible(false);
		@Pc(483) Button local483 = new Button("Go Back");
		local483.setBounds(150, 250, 200, 22);
		local483.addActionListener(this);
		this.aPanel11.add(local483);
		this.add(this.aPanel11);
		this.aPanel12 = new Panel(null);
		this.aPanel12.setSize(this.getSize());
		this.aPanel12.add(this.method40("Two or more of the answers you entered were", 120, 200));
		this.aPanel12.add(this.method40("the same. All answers must be different.", 130, 220));
		this.aPanel12.setVisible(false);
		@Pc(540) Button local540 = new Button("Go Back");
		local540.setBounds(150, 250, 200, 22);
		local540.addActionListener(this);
		this.aPanel12.add(local540);
		this.add(this.aPanel12);
		this.aPanel13 = new Panel(null);
		this.aPanel13.setSize(this.getSize());
		this.aPanel13.add(this.method40("One or more of your questions matches one", 120, 200));
		this.aPanel13.add(this.method40("of the answers you entered. Please make sure", 110, 220));
		this.aPanel13.add(this.method40("that none of your answers match any of your questions.", 90, 240));
		this.aPanel13.setVisible(false);
		@Pc(606) Button local606 = new Button("Go Back");
		local606.setBounds(150, 270, 200, 22);
		local606.addActionListener(this);
		this.aPanel13.add(local606);
		this.add(this.aPanel13);
	}

	@OriginalMember(owner = "client!passwordapp", name = "init_change_questions", descriptor = "()V", line = 188)
	private void method39() {
		this.aPanel14 = new Panel(null);
		this.aTextField1 = this.method42(20, 150, 0, 150, true);
		this.aTextFieldArray1[0] = this.method42(40, 100, 70, 250, false);
		this.aTextFieldArray1[0].setText(this.aStringArray2[0]);
		this.aTextFieldArray2[0] = this.method42(40, 100, 100, 250, true);
		this.aTextFieldArray1[1] = this.method42(40, 100, 170, 250, false);
		this.aTextFieldArray1[1].setText(this.aStringArray2[1]);
		this.aTextFieldArray2[1] = this.method42(40, 100, 200, 250, true);
		this.aTextFieldArray1[2] = this.method42(40, 100, 270, 250, false);
		this.aTextFieldArray1[2].setText(this.aStringArray2[2]);
		this.aTextFieldArray2[2] = this.method42(40, 100, 300, 250, true);
		this.aTextFieldArray1[3] = this.method42(40, 100, 370, 250, false);
		this.aTextFieldArray1[3].setText(this.aStringArray2[3]);
		this.aTextFieldArray2[3] = this.method42(40, 100, 400, 250, true);
		this.aTextFieldArray1[4] = this.method42(40, 100, 470, 250, false);
		this.aTextFieldArray1[4].setText(this.aStringArray2[4]);
		this.aTextFieldArray2[4] = this.method42(40, 100, 500, 250, true);
		this.aPanel14.setBackground(Color.black);
		this.aPanel14.add(this.method41("Current Password:", 0, 0, 150));
		this.aPanel14.add(this.aTextField1);
		@Pc(209) Label local209 = this.method40("Recovery Question 1", 0, 40);
		local209.setFont(new Font("Arial", 1, 13));
		this.aPanel14.add(local209);
		this.aPanel14.add(this.method41("Question:", 0, 70, 100));
		this.aPanel14.add(this.aTextFieldArray1[0]);
		@Pc(246) Button local246 = new Button("New Question");
		local246.setActionCommand("NEWRQ1");
		local246.setBounds(360, 70, 140, 22);
		local246.addActionListener(this);
		this.aPanel14.add(local246);
		this.aPanel14.add(this.method41("Answer:", 0, 100, 100));
		this.aPanel14.add(this.aTextFieldArray2[0]);
		@Pc(288) Label local288 = this.method40("Recovery Question 2", 0, 140);
		local288.setFont(new Font("Arial", 1, 13));
		this.aPanel14.add(local288);
		this.aPanel14.add(this.method41("Question:", 0, 170, 100));
		this.aPanel14.add(this.aTextFieldArray1[1]);
		@Pc(325) Button local325 = new Button("New Question");
		local325.setActionCommand("NEWRQ2");
		local325.setBounds(360, 170, 140, 22);
		local325.addActionListener(this);
		this.aPanel14.add(local325);
		this.aPanel14.add(this.method41("Answer:", 0, 200, 100));
		this.aPanel14.add(this.aTextFieldArray2[1]);
		@Pc(367) Label local367 = this.method40("Recovery Question 3", 0, 240);
		local367.setFont(new Font("Arial", 1, 13));
		this.aPanel14.add(local367);
		this.aPanel14.add(this.method41("Question:", 0, 270, 100));
		this.aPanel14.add(this.aTextFieldArray1[2]);
		@Pc(404) Button local404 = new Button("New Question");
		local404.setActionCommand("NEWRQ3");
		local404.setBounds(360, 270, 140, 22);
		local404.addActionListener(this);
		this.aPanel14.add(local404);
		this.aPanel14.add(this.method41("Answer:", 0, 300, 100));
		this.aPanel14.add(this.aTextFieldArray2[2]);
		@Pc(446) Label local446 = this.method40("Recovery Question 4", 0, 340);
		local446.setFont(new Font("Arial", 1, 13));
		this.aPanel14.add(local446);
		this.aPanel14.add(this.method41("Question:", 0, 370, 100));
		this.aPanel14.add(this.aTextFieldArray1[3]);
		@Pc(483) Button local483 = new Button("New Question");
		local483.setActionCommand("NEWRQ4");
		local483.setBounds(360, 370, 140, 22);
		local483.addActionListener(this);
		this.aPanel14.add(local483);
		this.aPanel14.add(this.method41("Answer:", 0, 400, 100));
		this.aPanel14.add(this.aTextFieldArray2[3]);
		@Pc(525) Label local525 = this.method40("Recovery Question 5", 0, 440);
		local525.setFont(new Font("Arial", 1, 13));
		this.aPanel14.add(local525);
		this.aPanel14.add(this.method41("Question:", 0, 470, 100));
		this.aPanel14.add(this.aTextFieldArray1[4]);
		@Pc(562) Button local562 = new Button("New Question");
		local562.setActionCommand("NEWRQ5");
		local562.setBounds(360, 470, 140, 22);
		local562.addActionListener(this);
		this.aPanel14.add(local562);
		this.aPanel14.add(this.method41("Answer:", 0, 500, 100));
		this.aPanel14.add(this.aTextFieldArray2[4]);
		@Pc(603) Button local603 = new Button("Submit Questions & Answers");
		local603.setBounds(150, 540, 200, 22);
		local603.addActionListener(this);
		this.aPanel14.add(local603);
		this.aPanel14.setSize(this.getSize());
		this.add(this.aPanel14);
	}

	@OriginalMember(owner = "client!passwordapp", name = "getLabel", descriptor = "(Ljava/lang/String;II)Ljava/awt/Label;", line = 297)
	private Label method40(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method41(arg0, arg1, arg2, arg0.length() * 8);
	}

	@OriginalMember(owner = "client!passwordapp", name = "getLabel", descriptor = "(Ljava/lang/String;IIII)Ljava/awt/Label;", line = 304)
	private Label method41(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) Label local5 = new Label(arg0, 0);
		local5.setForeground(Color.white);
		local5.setBackground(Color.black);
		local5.setFont(new Font("Arial", 0, 13));
		local5.setBounds(arg1, arg2, arg3, 20);
		return local5;
	}

	@OriginalMember(owner = "client!passwordapp", name = "getTextField", descriptor = "(IIIIIZ)Ljava/awt/TextField;", line = 313)
	private TextField method42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(4) TextField local4 = new TextField(arg0);
		local4.setBounds(arg1, arg2, arg3, 20);
		if (arg4) {
			local4.setEchoChar('*');
		}
		local4.addTextListener(this);
		local4.addKeyListener(this);
		local4.setForeground(Color.black);
		local4.setBackground(Color.white);
		return local4;
	}

	@OriginalMember(owner = "client!passwordapp", name = "safesizestring", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 328)
	private String method43(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(2) String local2 = arg0.trim();
		return local2.length() > arg1 ? local2.substring(0, arg1) : local2;
	}

	@OriginalMember(owner = "client!passwordapp", name = "actionPerformed", descriptor = "(Ljava/awt/event/ActionEvent;)V", line = 375)
	@Override
	public void actionPerformed(@OriginalArg(0) ActionEvent arg0) {
		if (this.aBoolean1) {
			if (this.aPanel1 != null) {
				this.aPanel1.setVisible(false);
				this.aPanel1 = null;
			}
			if (this.aPanel2 != null) {
				this.aPanel2.setVisible(true);
				this.aPanel2 = null;
			}
			this.aBoolean1 = false;
			return;
		}
		if (this.anInt5 == 2) {
			@Pc(33) String local33 = arg0.getActionCommand();
			if (local33 != null && local33.startsWith("NEWRQ")) {
				@Pc(52) String local52 = this.aStringArray2[(int) (Math.random() * (double) (this.aStringArray2.length - 1))];
				if (local33.equals("NEWRQ1")) {
					this.aTextFieldArray1[0].setText(local52);
					return;
				}
				if (local33.equals("NEWRQ2")) {
					this.aTextFieldArray1[1].setText(local52);
					return;
				}
				if (local33.equals("NEWRQ3")) {
					this.aTextFieldArray1[2].setText(local52);
					return;
				}
				if (local33.equals("NEWRQ4")) {
					this.aTextFieldArray1[3].setText(local52);
					return;
				}
				if (local33.equals("NEWRQ5")) {
					this.aTextFieldArray1[4].setText(local52);
				}
				return;
			}
			this.aPanel14.setVisible(false);
			if (this.aTextField1.getText().length() < 1 || this.aTextField1.getText().length() > 20) {
				this.aPanel7.setVisible(true);
				this.aBoolean1 = true;
				this.aPanel2 = this.aPanel14;
				this.aPanel1 = this.aPanel7;
				return;
			}
			@Pc(141) int local141 = 0;
			label142: while (true) {
				if (local141 >= 5) {
					@Pc(198) int local198;
					for (@Pc(182) int local182 = 0; local182 < 5; local182++) {
						@Pc(190) String local190 = this.aTextFieldArray1[local182].getText().trim();
						if (!local190.equals("")) {
							for (local198 = local182 + 1; local198 < 5; local198++) {
								if (local190.equalsIgnoreCase(this.aTextFieldArray1[local198].getText())) {
									this.aPanel11.setVisible(true);
									this.aBoolean1 = true;
									this.aPanel2 = this.aPanel14;
									this.aPanel1 = this.aPanel11;
									return;
								}
							}
						}
					}
					for (@Pc(233) int local233 = 0; local233 < 5; local233++) {
						@Pc(242) String local242 = Static2.method44(this.aTextFieldArray2[local233].getText()).trim();
						if (!local242.equals("")) {
							for (@Pc(250) int local250 = local233 + 1; local250 < 5; local250++) {
								if (Static2.method44(local242).equalsIgnoreCase(Static2.method44(this.aTextFieldArray2[local250].getText()))) {
									this.aPanel12.setVisible(true);
									this.aBoolean1 = true;
									this.aPanel2 = this.aPanel14;
									this.aPanel1 = this.aPanel12;
									return;
								}
							}
						}
					}
					local198 = 0;
					while (true) {
						if (local198 >= 5) {
							break label142;
						}
						@Pc(296) String local296 = Static2.method44(this.aTextFieldArray2[local198].getText()).trim();
						if (!local296.equals("")) {
							for (@Pc(302) int local302 = 0; local302 < 5; local302++) {
								if (local296.equalsIgnoreCase(Static2.method44(this.aTextFieldArray1[local302].getText()))) {
									this.aPanel13.setVisible(true);
									this.aBoolean1 = true;
									this.aPanel2 = this.aPanel14;
									this.aPanel1 = this.aPanel13;
									return;
								}
							}
						}
						local198++;
					}
				}
				if (this.aTextFieldArray1[local141].getText().trim().length() < 3 || Static2.method44(this.aTextFieldArray2[local141].getText()).length() < 3) {
					this.aPanel10.setVisible(true);
					this.aBoolean1 = true;
					this.aPanel2 = this.aPanel14;
					this.aPanel1 = this.aPanel10;
					return;
				}
				local141++;
			}
		}
		this.aPanel3.setVisible(true);
		@Pc(345) Thread local345 = new Thread(this);
		local345.setDaemon(true);
		local345.start();
	}

	@OriginalMember(owner = "client!passwordapp", name = "run", descriptor = "()V", line = 489)
	@Override
	public void run() {
		if (!this.aBoolean2) {
			if (this.aBoolean3) {
				System.out.println("Initialising");
			}
			this.aString1 = this.getCodeBase().toString();
			@Pc(15) boolean local15 = false;
			for (@Pc(17) int local17 = 0; local17 < aStringArray1.length; local17++) {
				if (this.aString1.startsWith(aStringArray1[local17])) {
					local15 = true;
					break;
				}
			}
			if (!local15) {
				this.aString1 = "http://recovery_questions.runescape.com/";
			}
			this.setLayout(null);
			this.setBackground(Color.black);
			this.method38();
			this.anInt5 = Integer.parseInt(this.getParameter("type"));
			this.aString2 = this.getParameter("username");
			this.anInt6 = Static2.method47(Static2.method46());
			if (this.anInt5 != 2) {
				throw new RuntimeException("Not enough parameters");
			}
			this.method39();
			this.aBoolean2 = true;
			return;
		}
		@Pc(81) SecureRandom local81 = new SecureRandom();
		@Pc(84) int[] local84 = new int[4];
		for (@Pc(86) int local86 = 0; local86 < local84.length; local86++) {
			local84[local86] = local81.nextInt();
		}
		@Pc(103) Class1 local103 = new Class1(new byte[66]);
		local103.method1(1);
		for (@Pc(108) int local108 = 0; local108 < local84.length; local108++) {
			local103.method5(local84[local108]);
		}
		local103.method34(this.aBigInteger1, this.aBigInteger2);
		@Pc(128) int local128 = local103.anInt1;
		local103.anInt1 = 0;
		@Pc(135) String local135 = local103.method37(local128);
		@Pc(141) Class1 local141 = new Class1(new byte[2048]);
		local141.method5(2);
		local141.method8(this.aString2);
		local141.method5(this.anInt6);
		if (this.anInt5 != 2) {
			return;
		}
		local141.method8(this.method43(this.aTextField1.getText(), 20));
		local141.method8(this.method43(this.aTextFieldArray1[0].getText(), 40));
		local141.method8(this.method43(Static2.method44(this.aTextFieldArray2[0].getText()), 40));
		local141.method8(this.method43(this.aTextFieldArray1[1].getText(), 40));
		local141.method8(this.method43(Static2.method44(this.aTextFieldArray2[1].getText()), 40));
		local141.method8(this.method43(this.aTextFieldArray1[2].getText(), 40));
		local141.method8(this.method43(Static2.method44(this.aTextFieldArray2[2].getText()), 40));
		local141.method8(this.method43(this.aTextFieldArray1[3].getText(), 40));
		local141.method8(this.method43(Static2.method44(this.aTextFieldArray2[3].getText()), 40));
		local141.method8(this.method43(this.aTextFieldArray1[4].getText(), 40));
		local141.method8(this.method43(Static2.method44(this.aTextFieldArray2[4].getText()), 40));
		@Pc(271) String local271 = "changequestions.cgi";
		local141.method36();
		@Pc(278) int local278 = local141.anInt1;
		local141.method32(local84);
		local141.anInt1 = 0;
		@Pc(288) String local288 = local141.method37(local278);
		@Pc(298) String local298 = this.aString1 + local271;
		try {
			@Pc(304) URL local304 = new URL(local298);
			@Pc(307) URLConnection local307 = local304.openConnection();
			local307.setDoInput(true);
			local307.setDoOutput(true);
			@Pc(319) OutputStreamWriter local319 = new OutputStreamWriter(local307.getOutputStream());
			local319.write("data1=" + Static2.method45(local135) + "&data2=" + Static2.method45(local288));
			local319.flush();
			@Pc(339) InputStream local339 = local307.getInputStream();
			local141.anInt1 = 0;
			while (local141.anInt1 < local141.aByteArray1.length && local339.read(local141.aByteArray1, local141.anInt1, local141.aByteArray1.length - local141.anInt1) != -1) {
			}
			local141.anInt1 = 0;
			local319.close();
			local339.close();
			@Pc(374) String local374 = local141.method26();
			this.aPanel3.setVisible(false);
			if (local374.startsWith("ATTACK")) {
				this.aPanel6.setVisible(true);
				return;
			}
			if (this.anInt5 == 2) {
				if (local374.startsWith("PENDING")) {
					this.aPanel9.setVisible(true);
					return;
				}
				if (local374.startsWith("ACTIVE")) {
					this.aPanel8.setVisible(true);
					return;
				}
				if (local374.startsWith("WRONG")) {
					this.aPanel7.setVisible(true);
					this.aBoolean1 = true;
					this.aPanel2 = this.aPanel14;
					this.aPanel1 = this.aPanel7;
					return;
				}
				this.aPanel4.setVisible(true);
				this.aBoolean1 = true;
				this.aPanel2 = this.aPanel14;
				this.aPanel1 = this.aPanel4;
				return;
			}
		} catch (@Pc(446) Throwable local446) {
			local446.printStackTrace();
			this.aPanel3.setVisible(false);
			this.aPanel4.setVisible(true);
			this.aBoolean1 = true;
			this.aPanel1 = this.aPanel4;
			if (this.anInt5 == 2) {
				this.aPanel2 = this.aPanel14;
			}
		}
	}

	@OriginalMember(owner = "client!passwordapp", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 623)
	@Override
	public void keyReleased(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!passwordapp", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 626)
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!passwordapp", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 633)
	@Override
	public void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		@Pc(2) int local2 = arg0.getKeyCode();
		if (local2 == 8 || local2 == 127 || arg0.isActionKey() || (arg0.getModifiers() & 0x2) != 0 || (arg0.getModifiers() & 0x8) != 0) {
			return;
		}
		@Pc(25) Object local25 = arg0.getSource();
		if (local25 instanceof TextField) {
			@Pc(31) TextField local31 = (TextField) local25;
			if (local31.getText().length() >= local31.getColumns() && local31.getSelectedText().equals("")) {
				arg0.consume();
				return;
			}
		} else if (local25 instanceof TextArea) {
			@Pc(51) TextArea local51 = (TextArea) local25;
			if (local51.getText().length() >= 400 && local51.getSelectedText().equals("")) {
				arg0.consume();
			}
		}
	}

	@OriginalMember(owner = "client!passwordapp", name = "textValueChanged", descriptor = "(Ljava/awt/event/TextEvent;)V", line = 647)
	@Override
	public void textValueChanged(@OriginalArg(0) TextEvent arg0) {
		@Pc(2) Object local2 = arg0.getSource();
		if (local2 instanceof TextField) {
			@Pc(8) TextField local8 = (TextField) local2;
			if (local8.getText().length() > local8.getColumns()) {
				local8.setText(local8.getText().substring(0, local8.getColumns()));
				local8.setCaretPosition(local8.getColumns());
				return;
			}
		} else if (local2 instanceof TextArea) {
			@Pc(33) TextArea local33 = (TextArea) local2;
			if (local33.getText().length() > 400) {
				local33.setText(local33.getText().substring(0, 400));
				local33.setCaretPosition(400);
			}
		}
	}

	@OriginalMember(owner = "client!passwordapp", name = "destroy", descriptor = "()V", line = 664)
	@Override
	public void destroy() {
	}
}
